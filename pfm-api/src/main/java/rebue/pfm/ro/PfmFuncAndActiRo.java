package rebue.pfm.ro;

import java.util.List;

import rebue.pfm.mo.PfmActiMo;
import rebue.pfm.mo.PfmFuncMo;

/**
 * 功能和动作返回值列表
 * 
 * @author lbl
 *
 */
public class PfmFuncAndActiRo {

	/**
	 * 功能实体类
	 */
	private List<PfmFuncMo> funcs;

	/**
	 * 动作实体类
	 */
	private List<PfmActiMo> actis;

	public List<PfmFuncMo> getFuncs() {
		return funcs;
	}

	public void setFuncs(List<PfmFuncMo> funcs) {
		this.funcs = funcs;
	}

	public List<PfmActiMo> getActis() {
		return actis;
	}

	public void setActis(List<PfmActiMo> actis) {
		this.actis = actis;
	}

	@Override
	public String toString() {
		return "PfmFuncAndActiRo [funcs=" + funcs + ", actis=" + actis + "]";
	}

}
