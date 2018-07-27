package rebue.pfm.svc;

import rebue.robotech.svc.MybatisBaseSvc;
import rebue.pfm.mo.PfmActiMo;
import rebue.pfm.ro.PfmActiRo;

public interface PfmActiSvc extends MybatisBaseSvc<PfmActiMo, java.lang.Long> {

	/**
	 * 删除动作
	 * 
	 * @param id
	 * @return
	 */
	PfmActiRo exDel(long id);

	/**
	 * 设置是否启用动作
	 * 
	 * @param mo
	 * @return
	 */
	PfmActiRo enable(PfmActiMo mo);

}