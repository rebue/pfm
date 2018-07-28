package rebue.pfm.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rebue.pfm.mo.PfmActiUrnMo;
import rebue.pfm.svc.PfmActiUrnSvc;
import rebue.pfm.to.PfmModifyActiUrnTo;
import rebue.pfm.ro.PfmActiUrnRo;

@RestController
public class PfmActiUrnCtrl {
	/**
	 * @mbg.generated
	 */
	private final static Logger _log = LoggerFactory.getLogger(PfmActiUrnCtrl.class);

	/**
	 * @mbg.generated
	 */
	@Resource
	private PfmActiUrnSvc svc;

	/**
	 * 有唯一约束的字段名称
	 *
	 * @mbg.generated
	 */
	private String _uniqueFilesName = "某字段内容";

	/**
	 * 添加动作URN
	 *
	 * @mbg.generated
	 */
	@PostMapping("/pfm/actiurn")
	PfmActiUrnRo add(@RequestBody PfmActiUrnMo mo) throws Exception {
		_log.info("add PfmActiUrnMo:" + mo);
		PfmActiUrnRo ro = new PfmActiUrnRo();
		try {
			int result = svc.add(mo);
			if (result == 1) {
				String msg = "添加成功";
				_log.info("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult((byte) 1);
				return ro;
			} else {
				String msg = "添加失败";
				_log.error("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult((byte) -1);
				return ro;
			}
		} catch (DuplicateKeyException e) {
			String msg = "添加失败，" + _uniqueFilesName + "已存在，不允许出现重复";
			_log.error("{}: mo-{}", msg, mo);
			ro.setMsg(msg);
			ro.setResult((byte) -1);
			return ro;
		}
	}

	/**
	 * 修改动作URN
	 */
	@SuppressWarnings("finally")
	@PutMapping("/pfm/actiurn")
	PfmActiUrnRo modify(@RequestBody PfmModifyActiUrnTo to) throws Exception {
		_log.info("modify PfmActiUrnMo:" + to);
		PfmActiUrnRo ro = new PfmActiUrnRo();
		try {
			ro = svc.exModify(to);
			_log.info("设置动作链接成功");
		} catch (RuntimeException e) {
			String msg = e.getMessage();
			ro.setResult((byte) -1);
			ro.setMsg(msg);
		} finally {
			return ro;
		}
	}

	/**
	 * 删除动作URN
	 * 
	 * @mbg.generated
	 */
	@DeleteMapping("/pfm/actiurn")
	PfmActiUrnRo del(@RequestParam("id") java.lang.Long id) {
		_log.info("save PfmActiUrnMo:" + id);
		int result = svc.del(id);
		PfmActiUrnRo ro = new PfmActiUrnRo();
		if (result == 1) {
			String msg = "删除成功";
			_log.info("{}: id-{}", msg, id);
			ro.setMsg(msg);
			ro.setResult((byte) 1);
			return ro;
		} else {
			String msg = "删除失败，找不到该记录";
			_log.error("{}: id-{}", msg, id);
			ro.setMsg(msg);
			ro.setResult((byte) -1);
			return ro;
		}
	}

	/**
	 * 查询动作URN
	 */
	@GetMapping("/pfm/actiurn")
	List<PfmActiUrnMo> list(PfmActiUrnMo mo) {
		_log.info("list PfmActiUrnMo:" + mo);
		return svc.list(mo);
	}

	/**
	 * 获取单个动作URN
	 * 
	 * @mbg.generated
	 */
	@GetMapping("/pfm/actiurn/getbyid")
	PfmActiUrnRo getById(@RequestParam("id") java.lang.Long id) {
		_log.info("get PfmActiUrnMo by id: " + id);
		PfmActiUrnMo result = svc.getById(id);
		_log.info("get: " + result);
		PfmActiUrnRo ro = new PfmActiUrnRo();
		if (result == null) {
			String msg = "获取失败，没有找到该条记录";
			_log.error("{}: id-{}", msg, id);
			ro.setMsg(msg);
			ro.setResult((byte) -1);
			return ro;
		} else {
			String msg = "获取成功";
			_log.info("{}: id-{}", msg, id);
			ro.setMsg(msg);
			ro.setResult((byte) 1);
			ro.setRecord(result);
			return ro;
		}
	}

}