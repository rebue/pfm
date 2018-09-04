package rebue.pfm.svc;

import java.util.List;
import rebue.pfm.mo.PfmActiMenuMo;
import rebue.pfm.to.PfmModifyActimenuTo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 动作菜单
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmActiMenuSvc extends MybatisBaseSvc<PfmActiMenuMo, java.lang.Long> {

    /**
     * 查询动作菜单
     *
     * @mbg.overrideByMethodName
     */
    @Override
    List<PfmActiMenuMo> list(PfmActiMenuMo mo);

    /**
     * 设置动作菜单
     *
     * @mbg.overrideByMethodName
     */
    Ro modify(PfmModifyActimenuTo to);
}
