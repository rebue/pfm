package rebue.pfm.svc;

import rebue.pfm.mo.PfmMenuMo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 菜单信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmMenuSvc extends MybatisBaseSvc<PfmMenuMo, java.lang.Long> {

    /**
     * 是否启用菜单
     */
    Ro enable(long id, boolean isEnabled);

    /**
     * 删除菜单
     * 1. 根据菜单id查询菜单编码
     * 2. 根据菜单编码删除菜单及其子菜单
     */
    Ro delEx(Long id);
}
