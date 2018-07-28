package rebue.pfm.to;

import java.util.Arrays;

public class PfmModifyRoleActiTo {

	/**
	 * 角色ｉｄ
	 */
	private Long roleId;

	/**
	 * 功能ｉｄ
	 */
	private Long[] actiIds;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long[] getActiIds() {
		return actiIds;
	}

	public void setActiIds(Long[] actiIds) {
		this.actiIds = actiIds;
	}

	@Override
	public String toString() {
		return "PfmModifyRoleActiTo [roleId=" + roleId + ", actiIds=" + Arrays.toString(actiIds) + "]";
	}

}
