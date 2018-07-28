package rebue.pfm.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rebue.pfm.mo.PfmRoleActiMo;
import rebue.pfm.ro.PfmRoleActiRo;
import rebue.pfm.svc.PfmRoleActiSvc;
import rebue.pfm.to.PfmModifyRoleActiTo;

@RestController
public class PfmRoleActiCtrl {

	private final static Logger _log = LoggerFactory.getLogger(PfmRoleActiCtrl.class);

	@Resource
	private PfmRoleActiSvc svc;

	/**
	 * 查询角色功能信息
	 * 
	 * @param mo
	 * @return
	 */
	@GetMapping("/pfm/roleacti")
	List<PfmRoleActiMo> list(PfmRoleActiMo mo) {
		_log.info("查询角色功能信息的参数为：{}", mo);
		return svc.list(mo);
	}
	
	/**
	 * 设置角色动作
	 * @param to
	 * @return
	 */
	@PutMapping("/pfm/roleacti")
	PfmRoleActiRo modify(@RequestBody PfmModifyRoleActiTo to) {
		_log.info("设置角色动作的参数为：{}", to);
		try {
			return svc.modify(to);
		} catch (RuntimeException e) {
			PfmRoleActiRo ro = new PfmRoleActiRo();
			String msg = e.getMessage();
			ro.setResult(-1);
			ro.setMsg(msg);
			return ro;
		}
	}
}
