package rebue.pfm.to;

import java.util.Arrays;

/**
 * 修改动作请求参数
 * @author lbl
 *
 */
public class PfmModifyActiUrnTo {

	/**
	 * 动作Ｉｄ
	 */
	private long actiId;

	/**
	 * 动作链接
	 */
	private String[] urns;

	public long getActiId() {
		return actiId;
	}

	public void setActiId(long actiId) {
		this.actiId = actiId;
	}

	public String[] getUrns() {
		return urns;
	}

	public void setUrns(String[] urns) {
		this.urns = urns;
	}

	@Override
	public String toString() {
		return "PfmUpdateActiUrnTo [actiId=" + actiId + ", urns=" + Arrays.toString(urns) + "]";
	}

}
