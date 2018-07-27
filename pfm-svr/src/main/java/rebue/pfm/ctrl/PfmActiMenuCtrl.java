package rebue.pfm.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rebue.pfm.mo.PfmActiMenuMo;
import rebue.pfm.ro.PfmActiMenuRo;
import rebue.pfm.svc.PfmActiMenuSvc;
import rebue.pfm.to.PfmModifyActimenuTo;

@RestController
public class PfmActiMenuCtrl {

	private final static Logger _log = LoggerFactory.getLogger(PfmActiMenuCtrl.class);

	@Resource
	private PfmActiMenuSvc svc;

	/**
	 * 查询动作菜单
	 * @param mo
	 * @return
	 */
	@GetMapping("/pfm/actimenu")
	List<PfmActiMenuMo> list(PfmActiMenuMo mo) {
		_log.info("查询动作菜单的参数为:{}", mo);
		return svc.list(mo);
	}
	
	/**
	 * 修改动作菜单
	 * @param mo
	 * @return
	 */
	@PutMapping("/pfm/actimenu")
	PfmActiMenuRo modify(@RequestBody PfmModifyActimenuTo to) {
		_log.info("修改动作菜单的参数为：{}", to);
		PfmActiMenuRo ro = new PfmActiMenuRo();
		try {
			return svc.modify(to);
		} catch (RuntimeException e) {
			String msg = e.getMessage();
			ro.setResult(-1);
			ro.setMsg(msg);
			return ro;
		}
	}
}
