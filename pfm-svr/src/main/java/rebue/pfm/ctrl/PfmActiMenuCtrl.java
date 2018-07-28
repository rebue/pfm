package rebue.pfm.ctrl;

import com.github.pagehelper.PageInfo;
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
import rebue.pfm.mo.PfmActiMenuMo;
import rebue.pfm.ro.PfmActiMenuRo;
import rebue.pfm.svc.PfmActiMenuSvc;
import rebue.pfm.to.PfmModifyActimenuTo;

@RestController
public class PfmActiMenuCtrl {

	/**
	 * 有唯一约束的字段名称
	 *
	 * @mbg.generated
	 */
	private String _uniqueFilesName = "某字段内容";

	/**
	 * 添加动作菜单
	 *
	 * @mbg.generated
	 */
	@PostMapping("/pfm/actimenu")
	PfmActiMenuRo add(@RequestBody PfmActiMenuMo mo) throws Exception {
		_log.info("add PfmActiMenuMo:" + mo);
		PfmActiMenuRo ro = new PfmActiMenuRo();
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
	 * 修改动作菜单
	 *
	 * @mbg.generated
	 */
	@PutMapping("/pfm/actimenu")
	PfmActiMenuRo modify(@RequestBody PfmActiMenuMo mo) throws Exception {
		_log.info("modify PfmActiMenuMo:" + mo);
		PfmActiMenuRo ro = new PfmActiMenuRo();
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
	 * 删除动作菜单
	 *
	 * @mbg.generated
	 */
	@DeleteMapping("/pfm/actimenu")
	PfmActiMenuRo del(@RequestParam("id") java.lang.Long id) {
		_log.info("save PfmActiMenuMo:" + id);
		int result = svc.del(id);
		PfmActiMenuRo ro = new PfmActiMenuRo();
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
	 * 查询动作菜单
	 *
	 * @mbg.generated
	 */
	@GetMapping("/pfm/actimenu")
	PageInfo<PfmActiMenuMo> list(PfmActiMenuMo mo, @RequestParam("pageNum") int pageNum,
			@RequestParam("pageSize") int pageSize) {
		_log.info("list PfmActiMenuMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
		if (pageSize > 50) {
			String msg = "pageSize不能大于50";
			_log.error(msg);
			throw new IllegalArgumentException(msg);
		}
		PageInfo<PfmActiMenuMo> result = svc.list(mo, pageNum, pageSize);
		_log.info("result: " + result);
		return result;
	}

	/**
	 * 获取单个动作菜单
	 *
	 * @mbg.generated
	 */
	@GetMapping("/pfm/actimenu/getbyid")
	PfmActiMenuRo getById(@RequestParam("id") java.lang.Long id) {
		_log.info("get PfmActiMenuMo by id: " + id);
		PfmActiMenuMo result = svc.getById(id);
		_log.info("get: " + result);
		PfmActiMenuRo ro = new PfmActiMenuRo();
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
	 * @mbg.generated
	 */
	private static final Logger _log = LoggerFactory.getLogger(PfmActiMenuCtrl.class);

	@Resource
	private PfmActiMenuSvc svc;

	/**
	 * 查询动作菜单
	 * 
	 * @param mo
	 * @return
	 * @mbg.overrideByMethodName
	 */
	@GetMapping("/pfm/actimenu")
	List<PfmActiMenuMo> list(PfmActiMenuMo mo) {
		_log.info("查询动作菜单的参数为:{}", mo);
		return svc.list(mo);
	}

	/**
	 * 修改动作菜单
	 * 
	 * @param mo
	 * @return
	 * 
	 * @mbg.overrideByMethodName
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
