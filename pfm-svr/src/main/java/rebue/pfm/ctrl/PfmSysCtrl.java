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

import rebue.pfm.mo.PfmSysMo;
import rebue.pfm.ro.PfmSysRo;
import rebue.pfm.svc.PfmSysSvc;

@RestController
public class PfmSysCtrl {
    /**
     * @mbg.generated
     */
    private final static Logger _log             = LoggerFactory.getLogger(PfmSysCtrl.class);

    /**
     * @mbg.generated
     */
    @Resource
    private PfmSysSvc           svc;

    /**
     * 有唯一约束的字段名称
     */
    private String              _uniqueFilesName = "系统名称";

    /**
     * 添加系统信息
     *
     * @mbg.generated
     */
    @PostMapping("/pfm/sys")
    PfmSysRo add(@RequestBody PfmSysMo mo) throws Exception {
        _log.info("add PfmSysMo:" + mo);
        PfmSysRo ro = new PfmSysRo();
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
     * 修改系统信息
     *
     * @mbg.generated
     */
    @PutMapping("/pfm/sys")
    PfmSysRo modify(@RequestBody PfmSysMo mo) throws Exception {
        _log.info("modify PfmSysMo:" + mo);
        PfmSysRo ro = new PfmSysRo();
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
     * 删除系统信息
     * 
     * @mbg.generated
     */
    @DeleteMapping("/pfm/sys")
    PfmSysRo del(@RequestParam("id") java.lang.String id) {
        _log.info("save PfmSysMo:" + id);
        int result = svc.del(id);
        PfmSysRo ro = new PfmSysRo();
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
     * 查询大卖系统管理
     * 
     * @mbg.overrideByMethodName
     */
    @GetMapping("/pfm/sys")
    List<PfmSysMo> list() {
        _log.info("list查询大卖系统");
        List<PfmSysMo> result = svc.listAll();
        _log.info("result: " + result);
        return result;
    }

}
