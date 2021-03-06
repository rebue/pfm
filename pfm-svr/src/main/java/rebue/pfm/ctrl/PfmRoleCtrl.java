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

import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.svc.PfmRoleSvc;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;

/**
 * 角色信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
public class PfmRoleCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final Logger _log             = LoggerFactory.getLogger(PfmRoleCtrl.class);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private PfmRoleSvc          svc;

    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String              _uniqueFilesName = "某字段内容";

    /**
     * 添加角色信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PostMapping("/pfm/role")
    Ro add(@RequestBody PfmRoleMo mo) throws Exception {
        _log.info("add PfmRoleMo: {}", mo);
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
            String msg = "添加失败，出现运行时异常(" + sdf.format(new Date()) + ")";
            _log.error(msg + ": mo=" + mo, e);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 修改角色信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PutMapping("/pfm/role")
    Ro modify(@RequestBody PfmRoleMo mo) throws Exception {
        _log.info("modify PfmRoleMo: {}", mo);
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
            _log.error(msg + ": mo=" + mo, e);
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
     * 获取单个角色信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/pfm/role/getbyid")
    PfmRoleMo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmRoleMo by id: " + id);
        return svc.getById(id);
    }

    /**
     * 查询角色信息
     *
     * @mbg.overrideByMethodName
     */
    @GetMapping("/pfm/role")
    List<PfmRoleMo> listBySysId(@RequestParam("sysId") String sysId) {
        _log.info("listBySysId: sysId=" + sysId);
        return svc.listBySysId(sysId);
    }

//    /**
//     * 删除角色信息  这里注释掉还有其后面一系列的方法也被注释掉是因为这个方法
//       少传了个用户id进来，只传了角色id，然后删除的时候所有是这个角色的用户的
//       该角色都被去掉，在搜索的时候发现这个方法没有被引用，所以注释掉，后续需要
//       使用再打开，但切记将用户id传进来。2019-11-6  徐亚明
//     */
//    @DeleteMapping("/pfm/role")
//    Ro del(@RequestParam("id") java.lang.Long id) {
//        _log.info("save PfmRoleMo:" + id);
//        Ro ro = new Ro();
//        try {
//            return svc.delEx(id);
//        } catch (Exception e) {
//            String msg = e.getMessage();
//            ro.setMsg(msg);
//            ro.setResult(ResultDic.FAIL);
//            return ro;
//        }
//    }

    /**
     * 设置角色是否启用
     */
    @PutMapping("/pfm/role/enable")
    Ro enable(@RequestBody PfmRoleMo mo) {
        _log.info("设置角色是否启用的参数为:{}", mo);
        return svc.enable(mo);
    }
    
    /**
     * 查询所有角色
     * @return
     */
    @GetMapping("/pfm/role/listAll")
    List<PfmRoleMo> listAll() {
        _log.info("开始查询所有角色");
        return svc.listAll();
    }
    
    
}
