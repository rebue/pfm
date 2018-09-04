package rebue.pfm.ctrl;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import rebue.pfm.mo.PfmActiUrnMo;
import rebue.pfm.svc.PfmActiUrnSvc;
import rebue.pfm.to.PfmModifyActiUrnTo;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;

/**
 * 动作URN
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
public class PfmActiUrnCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final Logger _log = LoggerFactory.getLogger(PfmActiUrnCtrl.class);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private PfmActiUrnSvc svc;

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加动作URN
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PostMapping("/pfm/actiurn")
    Ro add(@RequestBody PfmActiUrnMo mo) throws Exception {
        _log.info("add PfmActiUrnMo:" + mo);
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
     * 删除动作URN
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteMapping("/pfm/actiurn")
    Ro del(@RequestParam("id") java.lang.Long id) {
        _log.info("save PfmActiUrnMo:" + id);
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
     * 获取单个动作URN
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/pfm/actiurn/getbyid")
    PfmActiUrnMo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmActiUrnMo by id: " + id);
        return svc.getById(id);
    }

    /**
     * 修改动作URN
     *
     * @mbg.overrideByMethodName
     */
    @SuppressWarnings("finally")
    @PutMapping("/pfm/actiurn")
    Ro modify(@RequestBody PfmModifyActiUrnTo to) throws Exception {
        _log.info("modify PfmActiUrnMo:" + to);
        Ro ro = new Ro();
        try {
            ro = svc.modify(to);
            _log.info("设置动作链接成功");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            ro.setResult(ResultDic.FAIL);
            ro.setMsg(msg);
        } finally {
            return ro;
        }
    }

    /**
     * 查询动作URN
     *
     * @mbg.overrideByMethodName
     */
    @GetMapping("/pfm/actiurn")
    List<PfmActiUrnMo> list(PfmActiUrnMo mo) {
        _log.info("list PfmActiUrnMo:" + mo);
        return svc.list(mo);
    }
}
