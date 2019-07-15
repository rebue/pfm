package rebue.pfm.svc.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.dozermapper.core.Mapper;

import rebue.pfm.mapper.PfmMenuMapper;
import rebue.pfm.mapper.PfmRoleMapper;
import rebue.pfm.mapper.PfmUrnMapper;
import rebue.pfm.ro.PfmCurrentUserRo;
import rebue.pfm.ro.PfmUserLoginRo;
import rebue.pfm.svc.PfmUserLoginSvc;
import rebue.suc.dic.LoginResultDic;
import rebue.suc.ro.CurrentUserRo;
import rebue.suc.ro.UserLoginRo;
import rebue.suc.svr.feign.SucUserSvc;
import rebue.suc.to.LoginByUserNameTo;

@Service
/**
 * <pre>
 * 在单独使用不带任何参数 的 @Transactional 注释时，
 * propagation(传播模式)=REQUIRED，readOnly=false，
 * isolation(事务隔离级别)=READ_COMMITTED，
 * 而且事务不会针对受控异常（checked exception）回滚。
 * 注意：
 * 一般是查询的数据库操作，默认设置readOnly=true, propagation=Propagation.SUPPORTS
 * 而涉及到增删改的数据库操作的方法，要设置 readOnly=false, propagation=Propagation.REQUIRED
 * </pre>
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class PfmUserLoginSvcImpl implements PfmUserLoginSvc {

    private static final Logger _log = LoggerFactory.getLogger(PfmUserLoginSvcImpl.class);

    @Resource
    protected PfmMenuMapper pfmMenuMapper;
    @Resource
    protected PfmUrnMapper  pfmUrnMapper;

    @Resource
    protected PfmRoleMapper PfmRoleMapper;

    @Resource
    private SucUserSvc sucUserSvc;

    @Resource
    private Mapper dozerMapper;

    /**
     * 用户登录(用户名称)
     */
    @Override
    public PfmUserLoginRo loginByUserName(final LoginByUserNameTo loginTo) {
        _log.info("用户登录(用户名称): {}", loginTo);
        final UserLoginRo userLoginRo = sucUserSvc.loginByUserName(loginTo);
        _log.info("调用用户中心的方法获取到: {}", userLoginRo);
        final PfmUserLoginRo ro = dozerMapper.map(userLoginRo, PfmUserLoginRo.class);
        if (LoginResultDic.SUCCESS == userLoginRo.getResult()) {
            ro.setMenus(pfmMenuMapper.selectByUserIdAndSysId(ro.getUserId(), loginTo.getSysId()));
            ro.setUrns(pfmUrnMapper.selectByUserIdAndSysId(ro.getUserId(), loginTo.getSysId()));
            ro.setRoles(PfmRoleMapper.selectByUserId(ro.getUserId()));
        }
        return ro;
    }

    /**
     * 商家登录(用户名称)
     */
    @Override
    public PfmUserLoginRo loginByBussinessName(final LoginByUserNameTo loginTo) {
        _log.info("用户登录(商家名称): {}", loginTo);
        final UserLoginRo userLoginRo = sucUserSvc.loginByBusinessName(loginTo);
        _log.info("调用用户中心的方法获取到: {}", userLoginRo);
        final PfmUserLoginRo ro = dozerMapper.map(userLoginRo, PfmUserLoginRo.class);
        if (LoginResultDic.SUCCESS == userLoginRo.getResult()) {
            ro.setMenus(pfmMenuMapper.selectByUserIdAndSysId(ro.getUserId(), loginTo.getSysId()));
            ro.setUrns(pfmUrnMapper.selectByUserIdAndSysId(ro.getUserId(), loginTo.getSysId()));
            ro.setRoles(PfmRoleMapper.selectByUserId(ro.getUserId()));
        }
        return ro;
    }

    /**
     * 获取当前用户信息
     */
    @Override
    public PfmCurrentUserRo getCurrentUser(final String sysId) {
        _log.info("获取当前用户信息: sysId={}", sysId);
        final CurrentUserRo currentUserRo = sucUserSvc.getCurrentUser();
        _log.info("调用用户中心的方法获取到: {}", currentUserRo);
        if (currentUserRo != null) {
            final PfmCurrentUserRo ro = dozerMapper.map(currentUserRo, PfmCurrentUserRo.class);
            ro.setMenus(pfmMenuMapper.selectByUserIdAndSysId(ro.getUserId(), sysId));
            ro.setUrns(pfmUrnMapper.selectByUserIdAndSysId(ro.getUserId(), sysId));
            return ro;
        }
        return null;
    }

}
