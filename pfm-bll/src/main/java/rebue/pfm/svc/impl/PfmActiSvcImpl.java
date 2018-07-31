package rebue.pfm.svc.impl;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.pfm.mapper.PfmActiMapper;
import rebue.pfm.mapper.PfmActiMenuMapper;
import rebue.pfm.mapper.PfmActiUrnMapper;
import rebue.pfm.mo.PfmActiMo;
import rebue.pfm.ro.PfmActiRo;
import rebue.pfm.svc.PfmActiSvc;
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
public class PfmActiSvcImpl extends MybatisBaseSvcImpl<PfmActiMo, java.lang.Long, PfmActiMapper> implements PfmActiSvc {

    /**
     * @mbg.generated
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmActiMo mo) {
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    private static final Logger _log = LoggerFactory.getLogger(PfmActiSvcImpl.class);

    @Resource
    private PfmActiUrnMapper pfmActiUrnMapper;

    @Resource
    private PfmActiMenuMapper pfmActiMenuMapper;

    /**
     *  删除动作
     *
     *  @param id
     *  @return
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PfmActiRo delEx(long id) {
        PfmActiRo ro = new PfmActiRo();
        _log.info("删除动作的参数为：｛｝", id);
        _log.info("删除动作链接的参数为：｛｝", id);
        // 删除动作链接
        pfmActiUrnMapper.deleteByActiId(id);
        // 删除动作菜单
        pfmActiMenuMapper.deleteByActiId(id);
        _log.info("删除动作的参数为：｛｝", id);
        int delResult = del(id);
        if (delResult != 1) {
            _log.error("删除动作失败，动作ｉｄ为：｛｝", id);
            ro.setResult((byte) -1);
            ro.setMsg("删除失败");
            return ro;
        } else {
            _log.error("删除动作成功，动作ｉｄ为：｛｝", id);
            ro.setResult((byte) 1);
            ro.setMsg("删除成功");
            return ro;
        }
    }

    /**
     *  设置是否启用动作
     *
     *  @param mo
     *  @return
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PfmActiRo enable(PfmActiMo mo) {
        PfmActiRo ro = new PfmActiRo();
        _log.info("设置是否启用动作的参数为：{}", mo);
        int enabledActionOrNotResult = _mapper.enabledActionOrNot(mo.getId(), mo.getIsEnabled());
        _log.info("设置是否启用动作的返回值为：{}", enabledActionOrNotResult);
        if (enabledActionOrNotResult != 1) {
            _log.error("设置是否启用动作失败，动作ｉｄ为：{}", mo.getId());
            ro.setResult((byte) -1);
            ro.setMsg("设置失败");
            return ro;
        }
        ro.setResult((byte) 1);
        ro.setMsg("设置成功");
        return ro;
    }
}
