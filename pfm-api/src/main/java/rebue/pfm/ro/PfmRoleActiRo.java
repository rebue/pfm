package rebue.pfm.ro;

public class PfmRoleActiRo {

	/**
	 * 1:成功 -1:失败
	 */
	private int result;

	/**
	 * 返回值
	 */
	private String msg;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PfmRoleActiRo [result=" + result + ", msg=" + msg + "]";
	}

}
