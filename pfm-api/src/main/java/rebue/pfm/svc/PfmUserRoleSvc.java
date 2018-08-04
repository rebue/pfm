package rebue.pfm.svc;

import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.ro.PfmUserRoleRo;
import rebue.pfm.to.PfmModifyUserRoleTo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface PfmUserRoleSvc extends MybatisBaseSvc<PfmUserRoleMo, java.lang.Long> {

	/**
	 * 设置用户角色
	 * 
	 * @param to
	 * @return
	 */
	PfmUserRoleRo modifyEx(PfmModifyUserRoleTo to);
}
