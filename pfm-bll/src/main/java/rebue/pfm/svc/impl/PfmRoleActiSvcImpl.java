package rebue.pfm.svc.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.pfm.mapper.PfmRoleActiMapper;
import rebue.pfm.mo.PfmRoleActiMo;
import rebue.pfm.ro.PfmRoleActiRo;
import rebue.pfm.svc.PfmRoleActiSvc;
import rebue.pfm.to.PfmModifyRoleActiTo;
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
public class PfmRoleActiSvcImpl extends MybatisBaseSvcImpl<PfmRoleActiMo, java.lang.Long, PfmRoleActiMapper> implements PfmRoleActiSvc {

    /**
     * @mbg.generated
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmRoleActiMo mo) {
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    private static final Logger _log = LoggerFactory.getLogger(PfmRoleActiSvcImpl.class);

    /**
     *  查询角色功能信息
     */
    @Override
    public List<PfmRoleActiMo> list(PfmRoleActiMo mo) {
        _log.info("查询角色功能信息的参数为：{}", mo);
        return _mapper.selectSelective(mo);
    }

    /**
     *  设置角色动作
     *  @param to
     *  @return
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PfmRoleActiRo modify(PfmModifyRoleActiTo to) {
        _log.info("设置角色动作的参数为：{}", to);
        _log.info("设置角色动作删除角色动作的参数为:{}", to.getRoleId());
        _mapper.deleteByRoleId(to.getRoleId());
        Long[] actiIds = to.getActiIds();
        for (int i = 0; i < actiIds.length; i++) {
            PfmRoleActiMo mo = new PfmRoleActiMo();
            mo.setId(_idWorker.getId());
            mo.setActiId(actiIds[i]);
            mo.setRoleId(to.getRoleId());
            _log.info("设置角色动作的参数为：{}", mo);
            int insertResult = _mapper.insert(mo);
            _log.info("设置角色动作的返回值为:{}", insertResult);
            if (insertResult != 1) {
                _log.error("设置角色动作失败，角色ｉｄ为：{}", to.getRoleId());
                throw new RuntimeException("设置失败");
            }
        }
        PfmRoleActiRo ro = new PfmRoleActiRo();
        ro.setResult(1);
        ro.setMsg("设置成功");
        return ro;
    }
}
