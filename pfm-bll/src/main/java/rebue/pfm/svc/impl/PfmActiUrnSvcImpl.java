package rebue.pfm.svc.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.pfm.mapper.PfmActiUrnMapper;
import rebue.pfm.mo.PfmActiUrnMo;
import rebue.pfm.svc.PfmActiUrnSvc;
import rebue.pfm.to.PfmModifyActiUrnTo;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

/**
 * 动作URN
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
public class PfmActiUrnSvcImpl extends MybatisBaseSvcImpl<PfmActiUrnMo, java.lang.Long, PfmActiUrnMapper> implements PfmActiUrnSvc {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmActiUrnMo mo) {
        _log.info("添加动作URN");
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    private final Logger _log = LoggerFactory.getLogger(PfmActiUrnSvcImpl.class);

    /**
     * 设置动作的链接
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Ro modify(PfmModifyActiUrnTo to) {
        _log.info("修改动作链接的参数为：｛｝", to);
        Ro ro = new Ro();
        // 根据动作ｉｄ删除所有动作链接
        _mapper.deleteByActiId(to.getActiId());
        String[] urns = to.getUrns()[0].split("\n");
        // 添加动作链接
        for (int i = 0; i < urns.length; i++) {
            PfmActiUrnMo mo = new PfmActiUrnMo();
            mo.setActiId(to.getActiId());
            mo.setUrn(urns[i]);
            _log.info("添加动作链接的参数为，｛｝", mo);
            int addResult = add(mo);
            _log.info("添加动作链接的返回值为：｛｝", addResult);
            if (addResult != 1) {
                _log.error("添加动作链接失败，动作Ｉｄ为：｛｝", to.getActiId());
                throw new RuntimeException("添加失败");
            }
        }
        ro.setResult(ResultDic.SUCCESS);
        ro.setMsg("添加成功");
        return ro;
    }
}
