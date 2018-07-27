package rebue.pfm.to;

import java.util.Arrays;

public class PfmModifyActimenuTo {

	/**
	 * 动作Ｉｄ
	 */
	private long actiId;

	/**
	 * 菜单Ｉｄ
	 */
	private String[] menuIds;

	public long getActiId() {
		return actiId;
	}

	public void setActiId(long actiId) {
		this.actiId = actiId;
	}

	public String[] getMenuIds() {
		return menuIds;
	}

	public void setMenuIds(String[] menuIds) {
		this.menuIds = menuIds;
	}

	@Override
	public String toString() {
		return "PfmModifyActimenuTo [actiId=" + actiId + ", menuIds=" + Arrays.toString(menuIds) + "]";
	}

}
