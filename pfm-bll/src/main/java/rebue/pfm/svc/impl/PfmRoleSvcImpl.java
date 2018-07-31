package rebue.pfm.svc.impl;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.pfm.mapper.PfmRoleActiMapper;
import rebue.pfm.mapper.PfmRoleMapper;
import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.ro.PfmRoleRo;
import rebue.pfm.svc.PfmRoleSvc;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

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
public class PfmRoleSvcImpl extends MybatisBaseSvcImpl<PfmRoleMo, java.lang.Long, PfmRoleMapper> implements PfmRoleSvc {

    /**
     * @mbg.generated
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmRoleMo mo) {
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    private static final Logger _log = LoggerFactory.getLogger(PfmRoleSvcImpl.class);

    @Resource
    private PfmRoleActiMapper pfmRoleActiMapper;

    /**
     *  是否启用角色
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PfmRoleRo enable(PfmRoleMo mo) {
        _log.info("设置角色是否启用的参数为：{}", mo);
        PfmRoleRo ro = new PfmRoleRo();
        int roleEnabledResult = _mapper.roleEnabled(mo.getId(), mo.getIsEnabled());
        _log.info("设置角色是否启用的返回值为：{}", roleEnabledResult);
        if (roleEnabledResult != 1) {
            _log.error("设置角色是否启用失败，角色ｉｄ为：{}", mo.getId());
            ro.setResult((byte) -1);
            ro.setMsg("设置失败");
            return ro;
        }
        _log.error("设置角色是否启用成功，角色ｉｄ为：{}", mo.getId());
        ro.setResult((byte) 1);
        ro.setMsg("设置成功");
        return ro;
    }

    /**
     *  删除角色
     *
     *  @param id
     *  @return
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PfmRoleRo delEx(long id) {
        PfmRoleRo pfmRoleRo = new PfmRoleRo();
        _log.info("删除角色的参数为：{}", id);
        pfmRoleActiMapper.deleteByRoleId(id);
        int deleteByPrimaryKeyResult = _mapper.deleteByPrimaryKey(id);
        _log.info("删除角色的返回值为：{}", deleteByPrimaryKeyResult);
        if (deleteByPrimaryKeyResult != 1) {
            _log.error("删除角色出错，角色ｉｄ为：{}", id);
            pfmRoleRo.setResult((byte) -1);
            pfmRoleRo.setMsg("删除失败");
            return pfmRoleRo;
        }
        _log.error("删除角色成功，角色ｉｄ为：{}", id);
        pfmRoleRo.setResult((byte) 1);
        pfmRoleRo.setMsg("删除成功");
        return pfmRoleRo;
    }
}
