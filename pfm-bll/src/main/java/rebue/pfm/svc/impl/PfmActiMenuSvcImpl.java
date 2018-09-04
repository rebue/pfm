package rebue.pfm.svc.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.pfm.mapper.PfmActiMenuMapper;
import rebue.pfm.mo.PfmActiMenuMo;
import rebue.pfm.svc.PfmActiMenuSvc;
import rebue.pfm.to.PfmModifyActimenuTo;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

/**
 * 动作菜单
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
public class PfmActiMenuSvcImpl extends MybatisBaseSvcImpl<PfmActiMenuMo, java.lang.Long, PfmActiMenuMapper> implements PfmActiMenuSvc {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final Logger _log = LoggerFactory.getLogger(PfmActiMenuSvcImpl.class);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmActiMenuMo mo) {
        _log.info("添加动作菜单");
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    /**
     * 查询动作菜单
     *
     * @mbg.overrideByMethodName
     */
    @Override
    public List<PfmActiMenuMo> list(PfmActiMenuMo mo) {
        _log.info("查询动作菜单的参数为：{}", mo);
        return _mapper.selectSelective(mo);
    }

    /**
     * 设置动作菜单
     *
     * @mbg.overrideByMethodName
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Ro modify(PfmModifyActimenuTo to) {
        _log.info("设置动作菜单的请求参数为：{}", to);
        Ro ro = new Ro();
        _log.info("设置动作菜单根据动作ｉｄ删除动作菜单的参数为：{}", to.getActiId());
        _mapper.deleteByActiId(to.getActiId());
        String[] menuIds = to.getMenuIds();
        for (int i = 0; i < menuIds.length; i++) {
            PfmActiMenuMo mo = new PfmActiMenuMo();
            mo.setId(_idWorker.getId());
            mo.setActiId(to.getActiId());
            mo.setMenuId(Long.parseLong(String.valueOf(menuIds[i])));
            _log.info("设置动作菜单添加动作菜单的参数为：{}", mo);
            int insertResult = _mapper.insert(mo);
            _log.info("设置动作菜单添加动作菜单的返回值为:{}", insertResult);
            if (insertResult != 1) {
                _log.error("设置动作菜单失败，动作ｉｄ为：{}", to.getActiId());
                throw new RuntimeException("设置失败");
            }
        }
        _log.info("设置动作菜单成功．动作编号为：{}", to.getActiId());
        ro.setResult(ResultDic.SUCCESS);
        ro.setMsg("设置成功");
        return ro;
    }
}
