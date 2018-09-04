package rebue.pfm.svc;

import rebue.pfm.mo.PfmActiMo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 动作信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmActiSvc extends MybatisBaseSvc<PfmActiMo, java.lang.Long> {

    /**
     * 设置是否启用动作
     *
     * @param mo
     * @return
     */
    Ro enable(PfmActiMo mo);

    /**
     * 设置是否鉴权
     *
     * @param mo
     * @return
     */
    Ro auth(PfmActiMo mo);
}
