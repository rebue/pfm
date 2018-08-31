package rebue.pfm.svc.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import rebue.pfm.mapper.PfmMenuMapper;
import rebue.pfm.mo.PfmMenuMo;
import rebue.pfm.ro.PfmMenuRo;
import rebue.pfm.svc.PfmMenuSvc;
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
public class PfmMenuSvcImpl extends MybatisBaseSvcImpl<PfmMenuMo, java.lang.Long, PfmMenuMapper> implements PfmMenuSvc {

    /**
     * @mbg.generated
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(PfmMenuMo mo) {
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    private static final Logger _log = LoggerFactory.getLogger(PfmMenuSvcImpl.class);

    /**
     * 是否启用菜单
     *
     * @param id
     * @param isEnabled
     * @return
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PfmMenuRo whetherToEnableMenu(long id, boolean isEnabled) {
        _log.info("是否启用菜单的参数为：｛｝，｛｝", id, isEnabled);
        PfmMenuRo ro = new PfmMenuRo();
        _log.info("是否启用菜单根据ｉｄ查询菜单信息的参数为：{}", id);
        PfmMenuMo mo = _mapper.selectByPrimaryKey(id);
        _log.info("启用或禁用菜单根据ｉｄ查询菜单信息的返回值为：{}", mo);
        int enableMenuResult = _mapper.enableMenu(mo.getCode(), isEnabled);
        _log.info("启用或禁用菜单的返回值为：｛｝", enableMenuResult);
        if (enableMenuResult < 1) {
            _log.info("是否启用菜单失败，菜单ｉｄ为：｛｝", id);
            ro.setResult((byte) -1);
            ro.setMsg("修改失败");
        } else {
            _log.info("是否启用菜单成功，菜单ｉｄ为：｛｝", id);
            ro.setResult((byte) 1);
            ro.setMsg("修改成功");
        }
        return ro;
    }

    /**
     * 删除菜单 1．根据菜单ｉｄ查询菜单编码 ２．根据菜单编码查询ｉｄ ３．根据菜单ｉｄ删除菜单
     *
     * @param code
     * @return
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PfmMenuRo delEx(long id) {
        PfmMenuRo menuRo = new PfmMenuRo();
        _log.info("删除菜单的请求参数为： {}", id);
        _log.info("删除菜单查询菜单信息的参数为：｛｝", id);
        // 查询菜单信息
        PfmMenuMo pfmMenuMo = _mapper.selectByPrimaryKey(id);
        _log.info("删除菜单查询菜单信息的返回值为：{}", pfmMenuMo);
        if (pfmMenuMo.getCode().equals("")) {
            _log.error("删除菜单查询菜单信息时出现没有这个菜单信息，菜单ｉｄ为：{}", id);
            menuRo.setResult((byte) -1);
            menuRo.setMsg("删除失败");
            return menuRo;
        }
        _log.info("删除菜单的参数为：{}", pfmMenuMo.getCode());
        int delResult = _mapper.deleteByCode(pfmMenuMo.getCode());
        if (delResult > 0) {
            _log.info("删除菜单成功，菜单ｉｄ为：{}", id);
            menuRo.setResult((byte) 1);
            menuRo.setMsg("删除成功");
            return menuRo;
        } else {
            _log.info("删除菜单失败，菜单ｉｄ为：{}", id);
            menuRo.setResult((byte) -1);
            menuRo.setMsg("删除失败");
            return menuRo;
        }
    }
}
