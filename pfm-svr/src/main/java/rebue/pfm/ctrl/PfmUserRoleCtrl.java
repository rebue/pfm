package rebue.pfm.ctrl;

import com.github.pagehelper.PageInfo;
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
import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.ro.PfmUserRoleRo;
import rebue.pfm.svc.PfmUserRoleSvc;

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

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加用户角色
     *
     * @mbg.generated
     */
    @PostMapping("/pfm/userrole")
    PfmUserRoleRo add(@RequestBody PfmUserRoleMo mo) throws Exception {
        _log.info("add PfmUserRoleMo:" + mo);
        PfmUserRoleRo ro = new PfmUserRoleRo();
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
     * 修改用户角色
     *
     * @mbg.generated
     */
    @PutMapping("/pfm/userrole")
    PfmUserRoleRo modify(@RequestBody PfmUserRoleMo mo) throws Exception {
        _log.info("modify PfmUserRoleMo:" + mo);
        PfmUserRoleRo ro = new PfmUserRoleRo();
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
     * 删除用户角色
     *
     * @mbg.generated
     */
    @DeleteMapping("/pfm/userrole")
    PfmUserRoleRo del(@RequestParam("id") java.lang.Long id) {
        _log.info("save PfmUserRoleMo:" + id);
        int result = svc.del(id);
        PfmUserRoleRo ro = new PfmUserRoleRo();
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
     * 查询用户角色
     *
     * @mbg.generated
     */
    @GetMapping("/pfm/userrole")
    PageInfo<PfmUserRoleMo> list(PfmUserRoleMo mo, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
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
}
