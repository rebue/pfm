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

import com.github.pagehelper.PageInfo;

import rebue.pfm.mo.PfmFuncMo;
import rebue.pfm.svc.PfmFuncSvc;
import rebue.pfm.ro.PfmFuncRo;

@RestController
public class PfmFuncCtrl {
    /**
     * @mbg.generated
     */
    private final static Logger _log = LoggerFactory.getLogger(PfmFuncCtrl.class);

    /**
     * @mbg.generated
     */
    @Resource
    private PfmFuncSvc svc;

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加功能信息
     *
     * @mbg.generated
     */
    @PostMapping("/pfm/func")
    PfmFuncRo add(@RequestBody PfmFuncMo mo) throws Exception {
        _log.info("add PfmFuncMo:" + mo);
        PfmFuncRo ro = new PfmFuncRo();
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
     * 修改功能信息
     *
     * @mbg.generated
     */
    @PutMapping("/pfm/func")
    PfmFuncRo modify(@RequestBody PfmFuncMo mo) throws Exception {
        _log.info("modify PfmFuncMo:" + mo);
        PfmFuncRo ro = new PfmFuncRo();
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
     * 删除功能信息
     * 
     * @mbg.generated
     */
    @DeleteMapping("/pfm/func")
    PfmFuncRo del(@RequestParam("id") java.lang.Long id) {
        _log.info("save PfmFuncMo:" + id);
        int result = svc.del(id);
        PfmFuncRo ro = new PfmFuncRo();
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
     * 查询功能信息
     * 
     * @mbg.generated
     */
    @GetMapping("/pfm/func")
    PageInfo<PfmFuncMo> list(PfmFuncMo mo, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        _log.info("list PfmFuncMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        PageInfo<PfmFuncMo> result = svc.list(mo, pageNum, pageSize);
        _log.info("result: " + result);
        return result;
    }

    /**
     * 获取单个功能信息
     * 
     * @mbg.generated
     */
    @GetMapping("/pfm/func/getbyid")
    PfmFuncRo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmFuncMo by id: " + id);
        PfmFuncMo result = svc.getById(id);
        _log.info("get: " + result);
        PfmFuncRo ro = new PfmFuncRo();
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
