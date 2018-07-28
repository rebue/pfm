package rebue.pfm.svc;

import rebue.pfm.mo.PfmMenuMo;
import rebue.pfm.ro.PfmMenuRo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface PfmMenuSvc extends MybatisBaseSvc<PfmMenuMo, java.lang.Long> {

    /**
     *  是否启用菜单
     *  @param id
     *  @param isEnabled
     *  @return
     */
    PfmMenuRo whetherToEnableMenu(long id, boolean isEnabled);

    /**
     *  删除菜单
     *  @param id
     *  @return
     */
    PfmMenuRo exDel(long id);
}
