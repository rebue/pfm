package rebue.pfm.svc;

import rebue.robotech.svc.MybatisBaseSvc;
import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.ro.PfmRoleRo;

public interface PfmRoleSvc extends MybatisBaseSvc<PfmRoleMo, java.lang.Long>{

	/**
	 * 设置角色是否启用
	 * @param mo
	 * @return
	 */
	PfmRoleRo enable(PfmRoleMo mo);

	/**
	 * 删除角色
	 * @param id
	 * @return
	 */
	PfmRoleRo exDel(long id);

}