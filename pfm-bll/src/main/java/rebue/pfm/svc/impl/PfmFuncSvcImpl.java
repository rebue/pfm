package rebue.pfm.svc.impl;

import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.pfm.mapper.PfmFuncMapper;
import rebue.pfm.mo.PfmActiMo;
import rebue.pfm.mo.PfmFuncMo;
import rebue.pfm.svc.PfmActiSvc;
import rebue.pfm.svc.PfmFuncSvc;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

/**
 * 功能信息
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
public class PfmFuncSvcImpl extends MybatisBaseSvcImpl<PfmFuncMo, java.lang.Long, PfmFuncMapper> implements PfmFuncSvc {

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmFuncMo mo) {
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        if (mo.getOrderNo() == null || mo.getOrderNo() == 0) {
            mo.setOrderNo((byte) 1);
        }
        return super.add(mo);
    }

    private final Logger _log = LoggerFactory.getLogger(PfmFuncSvcImpl.class);

    @Resource
    private PfmActiSvc pfmActiSvc;

    /**
     * 删除功能
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int del(Long id) {
        _log.info("删除功能的参数为：｛｝", id);
        // 根据功能ｉｄ查询所有动作
        PfmActiMo actiMo = new PfmActiMo();
        actiMo.setFuncId(id);
        _log.info("删除功能根据功能ｉｄ查询动作的参数为：{}", actiMo);
        List<PfmActiMo> actiList = pfmActiSvc.list(actiMo);
        _log.info("删除功能根据功能ｉｄ查询动作的返回值为：｛｝", String.valueOf(actiList));
        if (actiList.size() != 0) {
            for (int i = 0; i < actiList.size(); i++) {
                if (pfmActiSvc.del(actiList.get(i).getId()) != 1L) {
                    _log.error("删除功能删除动作时，出现错误，功能ｉｄ为：｛｝", id);
                    throw new RuntimeException("删除动作失败");
                }
            }
        }
        _log.info("删除功能的参数为：{}", id);
        return super.del(id);
    }

    /**
     * 设置是否启用功能
     *
     * @param mo
     * @return
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Ro enable(PfmFuncMo mo) {
        _log.info("设置功能是否启用的参数为：{}", mo);
        PfmActiMo pfmActiMo = new PfmActiMo();
        pfmActiMo.setFuncId(mo.getId());
        _log.info("根据功能ｉｄ查询动作信息的参数为：{}", pfmActiMo);
        List<PfmActiMo> actiList = pfmActiSvc.list(pfmActiMo);
        _log.info("根据功能ｉｄ查询动作信息的返回值为：{}", String.valueOf(actiList));
        if (actiList.size() != 0) {
            for (int i = 0; i < actiList.size(); i++) {
                pfmActiMo = new PfmActiMo();
                pfmActiMo.setId(actiList.get(i).getId());
                pfmActiMo.setIsEnabled(mo.getIsEnabled());
                _log.info("设置功能是否启用设置动作是否启用的参数为：{}", pfmActiMo);
                Ro enableResult = pfmActiSvc.enable(pfmActiMo);
                _log.info("设置功能是否启用设置动作是否启用的返回值为：{}", enableResult);
                if (enableResult.getResult() != ResultDic.SUCCESS) {
                    _log.error("设置功能是否启用设置动作是否启用时出现错误，功能ｉｄ为:{}", mo.getId());
                    throw new RuntimeException("设置失败");
                }
            }
        }
        _log.info("设置功能是否启用的参数为：{}", mo);
        int functionEnabledResult = _mapper.functionEnabled(mo.getId(), mo.getIsEnabled());
        if (functionEnabledResult != 1) {
            _log.error("设置功能是否启用失败，功能ｉｄ为：{}", mo.getId());
            throw new RuntimeException("设置失败");
        }
        _log.info("设置是否启用功能成功，功能ｉｄ为:{}", mo.getId());
        Ro ro = new Ro();
        ro.setResult(ResultDic.SUCCESS);
        ro.setMsg("设置成功");
        return ro;
    }
}
