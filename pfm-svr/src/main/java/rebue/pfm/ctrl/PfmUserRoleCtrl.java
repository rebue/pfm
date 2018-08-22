package rebue.pfm.ctrl;

import com.github.pagehelper.PageInfo;

import java.util.List;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.ro.PfmUserRoleAndRoleRo;
import rebue.pfm.ro.PfmUserRoleRo;
import rebue.pfm.svc.PfmRoleSvc;
import rebue.pfm.svc.PfmUserRoleSvc;
import rebue.pfm.to.PfmModifyUserRoleTo;
import rebue.suc.mo.SucUserMo;

@RestController
public class PfmUserRoleCtrl {

	/**
	 * @mbg.generated
	 */
	private static final Logger _log = LoggerFactory.getLogger(PfmUserRoleCtrl.class);

	/**
	 * @mbg.generated
	 */
	@Resource
	private PfmUserRoleSvc svc;

	@Resource
	private PfmRoleSvc pfmRoleSvc;

	/**
	 * 添加用户角色
	 *
	 * @mbg.overrideByMethodName
	 */
	@PostMapping("/pfm/userrole")
	PfmUserRoleRo add(@RequestBody PfmUserRoleMo mo) throws Exception {
		_log.info("add PfmUserRoleMo:" + mo);
		return svc.addEx(mo);
	}

	/**
	 * 修改用户角色
	 * 
	 * @mbg.overrideByMethodName
	 */
	@PutMapping("/pfm/userrole")
	PfmUserRoleRo modify(@RequestBody PfmModifyUserRoleTo to) throws Exception {
		_log.info("modify PfmUserRoleMo:" + to);
		PfmUserRoleRo ro = new PfmUserRoleRo();
		try {
			return svc.modifyEx(to);
		} catch (RuntimeException e) {
			String msg = e.getMessage();
			ro.setMsg(msg);
			ro.setResult((byte) -1);
			return ro;
		}
	}

	/**
	 * 删除用户角色
	 *
	 * @mbg.overrideByMethodName
	 */
	@DeleteMapping("/pfm/userrole")
	PfmUserRoleRo del(@RequestBody PfmUserRoleMo mo) {
		_log.info("save PfmUserRoleMo:" + mo);
		return svc.delEx(mo);
	}

	/**
	 * 查询用户角色
	 *
	 * @mbg.generated
	 */
	@GetMapping("/pfm/userrole")
	PageInfo<PfmUserRoleMo> list(PfmUserRoleMo mo, @RequestParam("pageNum") int pageNum,
			@RequestParam("pageSize") int pageSize) {
		_log.info("list PfmUserRoleMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
		if (pageSize > 50) {
			String msg = "pageSize不能大于50";
			_log.error(msg);
			throw new IllegalArgumentException(msg);
		}
		PageInfo<PfmUserRoleMo> result = svc.list(mo, pageNum, pageSize);
		_log.info("result: " + result);
		return result;
	}

	/**
	 * 获取单个用户角色
	 *
	 * @mbg.generated
	 */
	@GetMapping("/pfm/userrole/getbyid")
	PfmUserRoleRo getById(@RequestParam("id") java.lang.Long id) {
		_log.info("get PfmUserRoleMo by id: " + id);
		PfmUserRoleMo result = svc.getById(id);
		_log.info("get: " + result);
		PfmUserRoleRo ro = new PfmUserRoleRo();
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
	 * 查询用户角色信息和角色信息
	 * 
	 * @param mo
	 * @return
	 */
	@GetMapping("/pfm/userroleandrole")
	PfmUserRoleAndRoleRo userRoleAndRoleList(PfmUserRoleMo mo) {
		_log.info("查询用户角色信息和角色信息的参数为：{}", mo);
		PfmUserRoleAndRoleRo ro = new PfmUserRoleAndRoleRo();
		_log.info("查询用户角色信息的参数为：{}", mo);
		List<PfmUserRoleMo> userRoleList = svc.list(mo);
		_log.info("查询用户角色信息的返回值为：{}", String.valueOf(userRoleList));
		ro.setUserRoleList(userRoleList);
		PfmRoleMo roleMo = new PfmRoleMo();
		roleMo.setSysId(mo.getSysId());
		roleMo.setIsEnabled(true);
		_log.info("查询角色信息的参数为：{}", roleMo);
		List<PfmRoleMo> roleList = pfmRoleSvc.list(roleMo);
		_log.info("查询角色信息的返回值为：{}", String.valueOf(roleList));
		ro.setRoleList(roleList);
		return ro;
	}

	
	/**
	 * 根据系统id和角色id查询用户分页信息
	 * @param sysId
	 * @param roleId
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/pfm/userrole/listuserbysysidandroleid")
	PageInfo<SucUserMo> listUserBySysIdAndRoleId(String sysId, Long roleId, int pageNum, int pageSize) {
		_log.info("根据系统id和角色id查询分页信息的参数为：sysId={}, roleId={}, pageNum={}, pageSize={}", sysId, roleId, pageNum, pageSize);
		return svc.listUserBySysIdAndRoleId(sysId, roleId, pageNum, pageSize);
	}

}
