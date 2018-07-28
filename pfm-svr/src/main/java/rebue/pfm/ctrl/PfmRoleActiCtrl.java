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
import rebue.pfm.mo.PfmRoleActiMo;
import rebue.pfm.ro.PfmRoleActiRo;
import rebue.pfm.svc.PfmRoleActiSvc;
import rebue.pfm.to.PfmModifyRoleActiTo;

@RestController
public class PfmRoleActiCtrl {

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加角色动作
     *
     * @mbg.generated
     */
    @PostMapping("/pfm/roleacti")
    PfmRoleActiRo add(@RequestBody PfmRoleActiMo mo) throws Exception {
        _log.info("add PfmRoleActiMo:" + mo);
        PfmRoleActiRo ro = new PfmRoleActiRo();
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
     * 修改角色动作
     *
     * @mbg.generated
     */
    @PutMapping("/pfm/roleacti")
    PfmRoleActiRo modify(@RequestBody PfmRoleActiMo mo) throws Exception {
        _log.info("modify PfmRoleActiMo:" + mo);
        PfmRoleActiRo ro = new PfmRoleActiRo();
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
     * 删除角色动作
     *
     * @mbg.generated
     */
    @DeleteMapping("/pfm/roleacti")
    PfmRoleActiRo del(@RequestParam("id") java.lang.Long id) {
        _log.info("save PfmRoleActiMo:" + id);
        int result = svc.del(id);
        PfmRoleActiRo ro = new PfmRoleActiRo();
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
     * 查询角色动作
     *
     * @mbg.generated
     */
    @GetMapping("/pfm/roleacti")
    PageInfo<PfmRoleActiMo> list(PfmRoleActiMo mo, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        _log.info("list PfmRoleActiMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        PageInfo<PfmRoleActiMo> result = svc.list(mo, pageNum, pageSize);
        _log.info("result: " + result);
        return result;
    }

    /**
     * 获取单个角色动作
     *
     * @mbg.generated
     */
    @GetMapping("/pfm/roleacti/getbyid")
    PfmRoleActiRo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmRoleActiMo by id: " + id);
        PfmRoleActiMo result = svc.getById(id);
        _log.info("get: " + result);
        PfmRoleActiRo ro = new PfmRoleActiRo();
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
    private static final Logger _log = LoggerFactory.getLogger(PfmRoleActiCtrl.class);

    @Resource
    private PfmRoleActiSvc svc;

    /**
     *  查询角色功能信息
     *
     *  @param mo
     *  @return
     *  @mbg.overrideByMethodName
     */
    @GetMapping("/pfm/roleacti")
    List<PfmRoleActiMo> list(PfmRoleActiMo mo) {
        _log.info("查询角色功能信息的参数为：{}", mo);
        return svc.list(mo);
    }

    /**
     *  设置角色动作
     *  @param to
     *  @return
     *  @mbg.overrideByMethodName
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
