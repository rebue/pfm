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
import rebue.pfm.mo.PfmMenuMo;
import rebue.pfm.ro.PfmMenuRo;
import rebue.pfm.svc.PfmMenuSvc;

@RestController
public class PfmMenuCtrl {

    /**
     * @mbg.generated
     */
    private static final Logger _log = LoggerFactory.getLogger(PfmMenuCtrl.class);

    /**
     * @mbg.generated
     */
    @Resource
    private PfmMenuSvc svc;

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated
     */
    private String _uniqueFilesName = "某字段内容";

    /**
     * 添加菜单信息
     *
     * @mbg.generated
     */
    @PostMapping("/pfm/menu")
    PfmMenuRo add(@RequestBody PfmMenuMo mo) throws Exception {
        _log.info("add PfmMenuMo:" + mo);
        PfmMenuRo ro = new PfmMenuRo();
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
     * 修改菜单信息
     *
     * @mbg.generated
     */
    @PutMapping("/pfm/menu")
    PfmMenuRo modify(@RequestBody PfmMenuMo mo) throws Exception {
        _log.info("modify PfmMenuMo:" + mo);
        PfmMenuRo ro = new PfmMenuRo();
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
     * 查询菜单信息
     *
     * @mbg.generated
     */
    @GetMapping("/pfm/menu")
    PageInfo<PfmMenuMo> list(PfmMenuMo mo, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        _log.info("list PfmMenuMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        PageInfo<PfmMenuMo> result = svc.list(mo, pageNum, pageSize);
        _log.info("result: " + result);
        return result;
    }

    /**
     * 获取单个菜单信息
     *
     * @mbg.generated
     */
    @GetMapping("/pfm/menu/getbyid")
    PfmMenuRo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmMenuMo by id: " + id);
        PfmMenuMo result = svc.getById(id);
        _log.info("get: " + result);
        PfmMenuRo ro = new PfmMenuRo();
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
     *  删除菜单信息
     */
    @DeleteMapping("/pfm/menu")
    PfmMenuRo del(@RequestParam("id") java.lang.Long id) {
        _log.info("save PfmMenuMo:" + id);
        return svc.exDel(id);
    }

    /**
     *  查询菜单信息
     */
    @GetMapping("/pfm/menu")
    List<PfmMenuMo> list(PfmMenuMo mo) {
        _log.info("list PfmMenuMo:" + mo);
        return svc.list(mo);
    }

    /**
     *  是否启用菜单
     *  @param mo
     *  @return
     */
    @PutMapping("/pfm/menu/enable")
    PfmMenuRo enable(@RequestBody PfmMenuMo mo) {
        _log.info("是否启用菜单的参数为：｛｝", mo);
        PfmMenuRo ro = svc.whetherToEnableMenu(mo.getId(), mo.getIsEnabled());
        _log.info("是否启用菜单的返回值为：｛｝", ro);
        return ro;
    }
}
