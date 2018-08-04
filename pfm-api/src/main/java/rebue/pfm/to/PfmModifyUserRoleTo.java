package rebue.pfm.to;

import java.util.Arrays;

public class PfmModifyUserRoleTo {

	/**
	 * 系统ｉｄ
	 */
	private String sysId;

	/**
	 * 用户ｉｄ
	 */
	private Long userId;

	/**
	 * 角色ｉｄ
	 */
	private Long[] roleIds;

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long[] getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Long[] roleIds) {
		this.roleIds = roleIds;
	}

	@Override
	public String toString() {
		return "PfmModifyUserRoleTo [sysId=" + sysId + ", userId=" + userId + ", roleIds=" + Arrays.toString(roleIds)
				+ "]";
	}

}
