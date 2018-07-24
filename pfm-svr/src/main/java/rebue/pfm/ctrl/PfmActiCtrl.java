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

import rebue.pfm.mo.PfmActiMo;
import rebue.pfm.svc.PfmActiSvc;
import rebue.pfm.ro.PfmActiRo;

@RestController
public class PfmActiCtrl {
    /**
     * @mbg.generated
     */
    private final static Logger _log = LoggerFactory.getLogger(PfmActiCtrl.class);

    /**
     * @mbg.generated
     */
    @Resource
    private PfmActiSvc svc;

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加动作信息
     *
     * @mbg.generated
     */
    @PostMapping("/pfm/acti")
    PfmActiRo add(@RequestBody PfmActiMo mo) throws Exception {
        _log.info("add PfmActiMo:" + mo);
        PfmActiRo ro = new PfmActiRo();
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
     * 修改动作信息
     *
     * @mbg.generated
     */
    @PutMapping("/pfm/acti")
    PfmActiRo modify(@RequestBody PfmActiMo mo) throws Exception {
        _log.info("modify PfmActiMo:" + mo);
        PfmActiRo ro = new PfmActiRo();
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
     * 删除动作信息
     * 
     * @mbg.generated
     */
    @DeleteMapping("/pfm/acti")
    PfmActiRo del(@RequestParam("id") java.lang.Long id) {
        _log.info("save PfmActiMo:" + id);
        int result = svc.del(id);
        PfmActiRo ro = new PfmActiRo();
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
     * 查询动作信息
     * 
     * @mbg.generated
     */
    @GetMapping("/pfm/acti")
    PageInfo<PfmActiMo> list(PfmActiMo mo, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        _log.info("list PfmActiMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        PageInfo<PfmActiMo> result = svc.list(mo, pageNum, pageSize);
        _log.info("result: " + result);
        return result;
    }

    /**
     * 获取单个动作信息
     * 
     * @mbg.generated
     */
    @GetMapping("/pfm/acti/getbyid")
    PfmActiRo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmActiMo by id: " + id);
        PfmActiMo result = svc.getById(id);
        _log.info("get: " + result);
        PfmActiRo ro = new PfmActiRo();
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
