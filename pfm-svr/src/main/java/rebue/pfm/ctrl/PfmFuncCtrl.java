package rebue.pfm.ctrl;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import rebue.pfm.mo.PfmFuncMo;
import rebue.pfm.ro.PfmFuncAndActiRo;
import rebue.pfm.svc.PfmActiSvc;
import rebue.pfm.svc.PfmFuncSvc;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;

/**
 * 功能信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
public class PfmFuncCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final Logger _log = LoggerFactory.getLogger(PfmFuncCtrl.class);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private PfmFuncSvc svc;

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加功能信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PostMapping("/pfm/func")
    Ro add(@RequestBody PfmFuncMo mo) throws Exception {
        _log.info("add PfmFuncMo:" + mo);
        Ro ro = new Ro();
        try {
            int result = svc.add(mo);
            if (result == 1) {
                String msg = "添加成功";
                _log.info("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.SUCCESS);
                return ro;
            } else {
                String msg = "添加失败";
                _log.error("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.FAIL);
                return ro;
            }
        } catch (DuplicateKeyException e) {
            String msg = "添加失败，" + _uniqueFilesName + "已存在，不允许出现重复";
            _log.error("{}: mo-{}", msg, mo);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        } catch (RuntimeException e) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String msg = "修改失败，出现运行时异常(" + sdf.format(new Date()) + ")";
            _log.error("{}: mo-{}", msg, mo);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 修改功能信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PutMapping("/pfm/func")
    Ro modify(@RequestBody PfmFuncMo mo) throws Exception {
        _log.info("modify PfmFuncMo:" + mo);
        Ro ro = new Ro();
        try {
            if (svc.modify(mo) == 1) {
                String msg = "修改成功";
                _log.info("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.SUCCESS);
                return ro;
            } else {
                String msg = "修改失败";
                _log.error("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.FAIL);
                return ro;
            }
        } catch (DuplicateKeyException e) {
            String msg = "修改失败，" + _uniqueFilesName + "已存在，不允许出现重复";
            _log.error("{}: mo-{}", msg, mo);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        } catch (RuntimeException e) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String msg = "修改失败，出现运行时异常(" + sdf.format(new Date()) + ")";
            _log.error("{}: mo-{}", msg, mo);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 删除功能信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteMapping("/pfm/func")
    Ro del(@RequestParam("id") java.lang.Long id) {
        _log.info("save PfmFuncMo:" + id);
        int result = svc.del(id);
        Ro ro = new Ro();
        if (result == 1) {
            String msg = "删除成功";
            _log.info("{}: id-{}", msg, id);
            ro.setMsg(msg);
            ro.setResult(ResultDic.SUCCESS);
            return ro;
        } else {
            String msg = "删除失败，找不到该记录";
            _log.error("{}: id-{}", msg, id);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 获取单个功能信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/pfm/func/getbyid")
    PfmFuncMo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmFuncMo by id: " + id);
        return svc.getById(id);
    }

    @Resource
    private PfmActiSvc pfmActiSvc;

    /**
     * 查询功能信息
     *
     * @mbg.overrideByMethodName
     */
    @GetMapping("/pfm/func")
    PfmFuncAndActiRo list(PfmFuncMo mo) {
        PfmFuncAndActiRo ro = new PfmFuncAndActiRo();
        ro.setFuncs(svc.list(mo));
        ro.setActis(pfmActiSvc.listAll());
        _log.info("list PfmFuncMo:" + ro);
        return ro;
    }

    /**
     * 设置功能是否启用
     */
    @PutMapping("/pfm/func/enable")
    Ro enable(@RequestBody PfmFuncMo mo) {
        _log.info("设置功能是否启用的参数为：{}", mo);
        try {
            return svc.enable(mo);
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            Ro ro = new Ro();
            ro.setResult(ResultDic.FAIL);
            ro.setMsg(msg);
            return ro;
        }
    }
}
