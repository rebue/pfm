package rebue.pfm.svc;

import java.util.List;
import rebue.pfm.mo.PfmActiMenuMo;
import rebue.pfm.ro.PfmActiMenuRo;
import rebue.pfm.to.PfmModifyActimenuTo;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 动作菜单
 * @author lbl
 */
public interface PfmActiMenuSvc extends MybatisBaseSvc<PfmActiMenuMo, java.lang.Long> {

    /**
     *  查询动作菜单
     *  @param mo
     *  @return
     */
    List<PfmActiMenuMo> list(PfmActiMenuMo mo);

    /**
     *  设置动作菜单
     *  @param to
     *  @return
     */
    PfmActiMenuRo modify(PfmModifyActimenuTo to);
}
