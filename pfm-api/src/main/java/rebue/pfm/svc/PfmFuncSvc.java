package rebue.pfm.svc;

import rebue.pfm.mo.PfmFuncMo;
import rebue.pfm.ro.PfmFuncRo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface PfmFuncSvc extends MybatisBaseSvc<PfmFuncMo, java.lang.Long> {

    /**
     *  删除功能
     *  @param id
     *  @return
     */
    PfmFuncRo delEx(long id);

    /**
     *  设置是否启用功能
     *  @param mo
     *  @return
     */
    PfmFuncRo enable(PfmFuncMo mo);
}
