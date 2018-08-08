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
import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.ro.PfmRoleRo;
import rebue.pfm.svc.PfmRoleSvc;

@RestController
public class PfmRoleCtrl {

	/**
	 * @mbg.generated
	 */
	private static final Logger _log = LoggerFactory.getLogger(PfmRoleCtrl.class);

	/**
	 * @mbg.generated
	 */
	@Resource
	private PfmRoleSvc svc;

	/**
	 * 有唯一约束的字段名称
	 *
	 * @mbg.generated
	 */
	private String _uniqueFilesName = "某字段内容";

	/**
	 * 添加角色信息
	 *
	 * @mbg.generated
	 */
	@PostMapping("/pfm/role")
	PfmRoleRo add(@RequestBody PfmRoleMo mo) throws Exception {
		_log.info("add PfmRoleMo:" + mo);
		PfmRoleRo ro = new PfmRoleRo();
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
	 * 修改角色信息
	 *
	 * @mbg.generated
	 */
	@PutMapping("/pfm/role")
	PfmRoleRo modify(@RequestBody PfmRoleMo mo) throws Exception {
		_log.info("modify PfmRoleMo:" + mo);
		PfmRoleRo ro = new PfmRoleRo();
		try {
			int result = svc.modify(mo);
			if (result == 1) {
				String msg = "修改成功";
				_log.info("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult((byte) 1);
				return ro;
			} else {
				String msg = "修改失败";
				_log.error("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult((byte) -1);
				return ro;
			}
		} catch (DuplicateKeyException e) {
			String msg = "修改失败，" + _uniqueFilesName + "已存在，不允许出现重复";
			_log.error("{}: mo-{}", msg, mo);
			ro.setMsg(msg);
			ro.setResult((byte) -1);
			return ro;
		}
	}

	/**
	 * 获取单个角色信息
	 *
	 * @mbg.generated
	 */
	@GetMapping("/pfm/role/getbyid")
	PfmRoleRo getById(@RequestParam("id") java.lang.Long id) {
		_log.info("get PfmRoleMo by id: " + id);
		PfmRoleMo result = svc.getById(id);
		_log.info("get: " + result);
		PfmRoleRo ro = new PfmRoleRo();
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

	/**
	 * 查询角色信息
	 *
	 * @mbg.overrideByMethodName
	 */
	@GetMapping("/pfm/role")
	List<PfmRoleMo> list(PfmRoleMo mo) {
		_log.info("list PfmRoleMo:" + mo);
		return svc.list(mo);
	}

	/**
	 * 删除角色信息
	 *
	 * @mbg.overrideByMethodName
	 */
	@DeleteMapping("/pfm/role")
	PfmRoleRo del(@RequestParam("id") java.lang.Long id) {
		_log.info("save PfmRoleMo:" + id);
		PfmRoleRo ro = new PfmRoleRo();
		try {
			return svc.delEx(id);
		} catch (Exception e) {
			String msg = e.getMessage();
			ro.setMsg(msg);
			ro.setResult((byte) -1);
			return ro;
		}
		
	}

	/**
	 * 设置角色是否启用
	 *
	 * @param mo
	 * @return
	 */
	@PutMapping("/pfm/role/enable")
	PfmRoleRo enable(@RequestBody PfmRoleMo mo) {
		_log.info("设置角色是否启用的参数为:{}", mo);
		return svc.enable(mo);
	}
}
