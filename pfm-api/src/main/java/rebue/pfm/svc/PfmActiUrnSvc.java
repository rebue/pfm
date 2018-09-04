package rebue.pfm.svc;

import rebue.pfm.mo.PfmActiUrnMo;
import rebue.pfm.to.PfmModifyActiUrnTo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 动作URN
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmActiUrnSvc extends MybatisBaseSvc<PfmActiUrnMo, java.lang.Long> {

    /**
     * 设置动作的链接
     */
    Ro modify(PfmModifyActiUrnTo to);
}
