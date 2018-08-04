package rebue.pfm.ro;

import java.util.List;

import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.mo.PfmUserRoleMo;

public class PfmUserRoleAndRoleRo {

	/**
	 * 用户角色
	 */
	private List<PfmUserRoleMo> userRoleList;

	/**
	 * 角色
	 */
	private List<PfmRoleMo> roleList;

	public List<PfmUserRoleMo> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<PfmUserRoleMo> userRoleList) {
		this.userRoleList = userRoleList;
	}

	public List<PfmRoleMo> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<PfmRoleMo> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "PfmUserRoleAndRoleRo [userRoleList=" + userRoleList + ", roleList=" + roleList + "]";
	}

}
