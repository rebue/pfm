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
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.springframework.dao.DuplicateKeyException;

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
		if (result < 1) {
			_log.error("{}删除系统信息失败");
			ro.setMsg("删除系统信息失败");
			ro.setResult((byte) -1);
			return ro;
		} else {
			_log.info("{}删除系统信息成功");
			ro.setMsg("删除系统信息成功");
			ro.setResult((byte) 1);
			return ro;
		}

	}

	/**
	 * 查询系统信息
	 * 
	 * @mbg.generated
	 */
	@GetMapping("/pfm/sys")
	PageInfo<PfmSysMo> list(PfmSysMo mo, @RequestParam("pageNum") int pageNum,
			@RequestParam("pageSize") int pageSize) {
		_log.info("list PfmSysMo:" + mo + ", pageNum = " + pageNum
				+ ", pageSize = " + pageSize);
		if (pageSize > 50) {
			String msg = "pageSize不能大于50";
			_log.error(msg);
			throw new IllegalArgumentException(msg);
		}
		PageInfo<PfmSysMo> result = svc.list(mo, pageNum, pageSize);
		_log.info("result: " + result);
		return result;
	}
	/**
	 * 获取单个系统信息
	 * 
	 * @mbg.generated
	 */
	@GetMapping("/pfm/sys/getbyid")
	PfmSysRo get(@RequestParam("id") java.lang.String id) {
		_log.info("get PfmSysMo by id: " + id);
		PfmSysMo result = svc.getById(id);
		_log.info("get: " + result);
		PfmSysRo ro = new PfmSysRo();
		if (result == null) {
			_log.error("{}获取单个系统信息失败");
			ro.setMsg("获取单个系统信息失败");
			ro.setResult((byte) -1);
			return ro;
		} else {
			_log.info("{}获取单个系统信息成功");
			ro.setMsg("获取单个系统信息成功");
			ro.setResult((byte) 1);
			ro.setRecord(result);
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

	/**
	 * 添加大卖系统管理
	 */
	@PostMapping("/pfm/sys")
	PfmSysRo add(@RequestBody PfmSysMo mo) throws Exception {
		_log.info("add PfmSysMo:" + mo);
		PfmSysRo ro = new PfmSysRo();
		try {
			int result = svc.add(mo);
			if (result < 1) {
				_log.error("{}添加大卖系统管理失败");
				ro.setMsg("添加大卖系统管理失败");
				ro.setResult((byte) -1);
				return ro;
			} else {
				_log.info("{}添加大卖系统管理成功");
				ro.setMsg("添加大卖系统管理成功");
				ro.setResult((byte) 1);
				return ro;
			}
		} catch (DuplicateKeyException e) {
			_log.error("{}添加大卖系统id或名字重复导致失败");
			ro.setMsg("添加大卖系统id或名字重复导致失败");
			ro.setResult((byte) -1);
			return ro;
		}
	}

	/**
	 * 修改大卖系统管理
	 */
	@PutMapping("/pfm/sys")
	PfmSysRo modify(@RequestBody PfmSysMo mo) throws Exception {
		_log.info("modify PfmSysMo:" + mo);
		PfmSysRo ro = new PfmSysRo();
		try {
			int result = svc.modify(mo);
			if (result < 1) {
				_log.error("{}修改大卖系统管理失败");
				ro.setMsg("修改大卖系统管理失败");
				ro.setResult((byte) -1);
				return ro;
			} else {
				_log.info("{}修改大卖系统管理成功");
				ro.setMsg("修改大卖系统管理成功");
				ro.setResult((byte) 1);
				return ro;
			}
		} catch (DuplicateKeyException e) {
			_log.error("{}修改大卖系统和已有的id或名字重复导致失败");
			ro.setMsg("修改大卖系统和已有的id或名字重复导致失败");
			ro.setResult((byte) -1);
			return ro;
		}
	}

}
