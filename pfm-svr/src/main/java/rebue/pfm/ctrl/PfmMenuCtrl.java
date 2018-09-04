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
import rebue.pfm.mo.PfmMenuMo;
import rebue.pfm.svc.PfmMenuSvc;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;

/**
 * 菜单信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
public class PfmMenuCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final Logger _log = LoggerFactory.getLogger(PfmMenuCtrl.class);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private PfmMenuSvc svc;

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加菜单信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PostMapping("/pfm/menu")
    Ro add(@RequestBody PfmMenuMo mo) throws Exception {
        _log.info("add PfmMenuMo:" + mo);
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
     * 修改菜单信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PutMapping("/pfm/menu")
    Ro modify(@RequestBody PfmMenuMo mo) throws Exception {
        _log.info("modify PfmMenuMo:" + mo);
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
     * 获取单个菜单信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/pfm/menu/getbyid")
    PfmMenuMo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmMenuMo by id: " + id);
        return svc.getById(id);
    }

    /**
     * 查询菜单信息
     *
     * @mbg.overrideByMethodName
     */
    @GetMapping("/pfm/menu")
    List<PfmMenuMo> list(PfmMenuMo mo) {
        _log.info("list PfmMenuMo:" + mo);
        return svc.list(mo);
    }

    /**
     * 删除菜单信息
     *
     * @mbg.overrideByMethodName
     */
    @DeleteMapping("/pfm/menu")
    Ro del(@RequestParam("id") java.lang.Long id) {
        _log.info("delete PfmMenuMo:" + id);
        return svc.delEx(id);
    }

    /**
     * 启用菜单
     */
    @PutMapping("/pfm/menu/enable")
    Ro enable(@RequestBody PfmMenuMo mo) {
        _log.info("是否启用菜单的参数为：｛｝", mo);
        return svc.enable(mo.getId(), mo.getIsEnabled());
    }
}
