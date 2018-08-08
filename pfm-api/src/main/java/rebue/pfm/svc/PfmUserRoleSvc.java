package rebue.pfm.svc;

import java.util.List;

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

	/**
	 * 根据系统id和角色id查询用户id
	 * @param sysId
	 * @param roleId
	 * @return
	 */
	List<Long> getUseIByRoleIdAndSysId(String sysId, Long roleId);

	/**
	 * 添加用户角色
	 * @param mo
	 * @return
	 */
	PfmUserRoleRo addEx(PfmUserRoleMo mo);

	/**
	 * 删除用户角色
	 * @param mo
	 * @return
	 */
	PfmUserRoleRo delEx(PfmUserRoleMo mo);
}
