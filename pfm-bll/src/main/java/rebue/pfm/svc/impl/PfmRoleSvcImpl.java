package rebue.pfm.svc.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import rebue.pfm.mapper.PfmRoleActiMapper;
import rebue.pfm.mapper.PfmRoleMapper;
import rebue.pfm.mapper.PfmUserRoleMapper;
import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.svc.PfmRoleSvc;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

/**
 * 角色信息
 *
 * 在单独使用不带任何参数的 @Transactional 注释时，
 * propagation(传播模式)=REQUIRED，readOnly=false，
 * isolation(事务隔离级别)=READ_COMMITTED，
 * 而且事务不会针对受控异常（checked exception）回滚。
 *
 * 注意：
 * 一般是查询的数据库操作，默认设置readOnly=true, propagation=Propagation.SUPPORTS
 * 而涉及到增删改的数据库操作的方法，要设置 readOnly=false, propagation=Propagation.REQUIRED
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Service
public class PfmRoleSvcImpl extends MybatisBaseSvcImpl<PfmRoleMo, java.lang.Long, PfmRoleMapper> implements PfmRoleSvc {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final Logger _log = LoggerFactory.getLogger(PfmRoleSvcImpl.class);

    /**
     * 添加角色
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmRoleMo mo) {
        _log.info("添加角色");
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        mo.setOrderNo(_mapper.getMaxOrderMoBySysId(mo.getSysId()));
        return super.add(mo);
    }

    @Resource
    private PfmUserRoleMapper pfmUserRoleMapper;

    @Resource
    private PfmRoleActiMapper pfmRoleActiMapper;

    /**
     * 删除角色
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Ro delEx(long id) {
        Ro ro = new Ro();
        _log.info("删除角色的参数为：{}", id);
        // 根据角色id删除动作
        pfmRoleActiMapper.deleteByRoleId(id);
        // 根据角色id删除用户角色
        pfmUserRoleMapper.deleteByRoleId(id);
        int deleteByPrimaryKeyResult = _mapper.deleteByPrimaryKey(id);
        _log.info("删除角色的返回值为：{}", deleteByPrimaryKeyResult);
        if (deleteByPrimaryKeyResult != 1) {
            _log.error("删除角色出错，角色ｉｄ为：{}", id);
            throw new RuntimeException("删除失败");
        }
        _log.error("删除角色成功，角色ｉｄ为：{}", id);
        ro.setResult(ResultDic.SUCCESS);
        ro.setMsg("删除成功");
        return ro;
    }

    /**
     * 是否启用角色
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Ro enable(PfmRoleMo mo) {
        _log.info("设置角色是否启用的参数为：{}", mo);
        Ro ro = new Ro();
        int roleEnabledResult = _mapper.roleEnabled(mo.getId(), mo.getIsEnabled());
        _log.info("设置角色是否启用的返回值为：{}", roleEnabledResult);
        if (roleEnabledResult != 1) {
            _log.error("设置角色是否启用失败，角色ｉｄ为：{}", mo.getId());
            ro.setResult(ResultDic.FAIL);
            ro.setMsg("设置失败");
            return ro;
        }
        _log.error("设置角色是否启用成功，角色ｉｄ为：{}", mo.getId());
        ro.setResult(ResultDic.SUCCESS);
        ro.setMsg("设置成功");
        return ro;
    }

    /**
     * 获取指定系统的角色列表
     */
    @Override
    public List<PfmRoleMo> listBySysId(String sysId) {
        _log.info("获取指定系统的角色列表: sysId={}", sysId);
        return _mapper.listBySysId(sysId);
    }

}
