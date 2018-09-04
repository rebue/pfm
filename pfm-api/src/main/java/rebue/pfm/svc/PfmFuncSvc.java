package rebue.pfm.svc;

import rebue.pfm.mo.PfmFuncMo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 功能信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmFuncSvc extends MybatisBaseSvc<PfmFuncMo, java.lang.Long> {

    /**
     * 设置是否启用功能
     *
     * @param mo
     * @return
     */
    Ro enable(PfmFuncMo mo);
}
