package rebue.pfm.svc;

import rebue.pfm.mo.PfmActiUrnMo;
import rebue.pfm.ro.PfmActiUrnRo;
import rebue.pfm.to.PfmModifyActiUrnTo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface PfmActiUrnSvc extends MybatisBaseSvc<PfmActiUrnMo, java.lang.Long> {

    /**
     *  设置动作的链接
     *
     *  @param to
     *  @return
     */
    PfmActiUrnRo exModify(PfmModifyActiUrnTo to);
}
