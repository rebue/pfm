package rebue.pfm.ctrl;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import rebue.pfm.mo.PfmSysMo;
import rebue.pfm.svc.PfmSysSvc;
import rebue.pfm.ro.PfmSysRo;
import org.springframework.dao.DuplicateKeyException;
import java.util.List;

@RestController
public class PfmSysCtrl {
	/**
	 * @mbg.generated
	 */
	private final static Logger _log = LoggerFactory
			.getLogger(PfmSysCtrl.class);

	/**
	 * @mbg.generated
	 */
	@Resource
	private PfmSysSvc svc;

	/**
	 * 删除系统信息
	 * 
	 * @mbg.generated
	 */
	@DeleteMapping("/pfm/sys")
	PfmSysRo del(@RequestParam("id") java.lang.String id) {

		_log.info("save PfmSysMo:" + id);
		int result = svc.del(id);
		PfmSysRo ro = new PfmSysRo();
		String fail = "删除失败";
		String success = "删除成功";
		if (result < 1) {
			_log.error("找不到该记录id: {}", id);
			ro.setMsg(fail);
			ro.setResult((byte) -1);
			return ro;
		} else {
			_log.info(success + "id: {}", id);
			ro.setMsg(success);
			ro.setResult((byte) 1);
			return ro;
		}

	}

	/**
	 * 获取单个系统信息
	 * 
	 * @mbg.generated
	 */
	@GetMapping("/pfm/sys/getbyid")
	PfmSysRo getById(@RequestParam("id") java.lang.String id) {
		_log.info("get PfmSysMo by id: " + id);
		PfmSysMo result = svc.getById(id);
		_log.info("get: " + result);
		PfmSysRo ro = new PfmSysRo();
		String fail = "获取失败";
		String success = "获取成功";
		if (result == null) {
			_log.error("没有该条记录id： {}", id);
			ro.setMsg(fail);
			ro.setResult((byte) -1);
			return ro;
		} else {
			_log.info(success + "id: {}", id);
			ro.setMsg(success);
			ro.setResult((byte) 1);
			ro.setRecord(result);
			return ro;
		}

	}

	/**
	 * 添加系统信息
	 */
	@PostMapping("/pfm/sys")
	PfmSysRo add(@RequestBody PfmSysMo mo) throws Exception {
		_log.info("add PfmSysMo:" + mo);
		String fail = "添加失败";
		String success = "添加成功";
		String repeat = "添加系统信息时已有名字重复导致失败";
		PfmSysRo ro = new PfmSysRo();
		try {
			int result = svc.add(mo);
			if (result < 1) {
				_log.error(fail + "mo: {}", mo);
				ro.setMsg(fail);
				ro.setResult((byte) -1);
				return ro;
			} else {
				_log.info(success + "mo: {}", mo);
				ro.setMsg(success);
				ro.setResult((byte) 1);
				return ro;
			}
		} catch (DuplicateKeyException e) {
			_log.error(repeat + "mo: {}", mo);
			ro.setMsg(repeat);
			ro.setResult((byte) -1);
			return ro;
		}
	}

	/**
	 * 修改系统信息
	 */
	@PutMapping("/pfm/sys")
	PfmSysRo modify(@RequestBody PfmSysMo mo) throws Exception {
		_log.info("modify PfmSysMo:" + mo);
		PfmSysRo ro = new PfmSysRo();
		String fail = "修改失败";
		String success = "修改成功";
		String repeat = "修改系统信息时和已有名字重复导致失败";
		try {
			int result = svc.modify(mo);
			if (result < 1) {
				_log.error(fail + "mo: {}", mo);
				ro.setMsg(fail);
				ro.setResult((byte) -1);
				return ro;
			} else {
				_log.info(success + "mo: {}", mo);
				ro.setMsg(success);
				ro.setResult((byte) 1);
				return ro;
			}
		} catch (DuplicateKeyException e) {
			_log.error(repeat + "mo: {}", mo);
			ro.setMsg(repeat);
			ro.setResult((byte) -1);
			return ro;
		}
	}

	/**
	 * 查询大卖系统管理
	 */
	@GetMapping("/pfm/sys")
	List<PfmSysMo> list() {
		_log.info("list查询大卖系统");
		List<PfmSysMo> result = svc.listAll();
		_log.info("result: " + result);
		return result;
	}

}
