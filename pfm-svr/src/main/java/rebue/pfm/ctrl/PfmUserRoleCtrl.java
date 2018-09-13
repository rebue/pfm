package rebue.pfm.ctrl;

import com.github.pagehelper.PageInfo;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.ro.PfmUserRoleAndRoleRo;
import rebue.pfm.svc.PfmRoleSvc;
import rebue.pfm.svc.PfmUserRoleSvc;
import rebue.pfm.to.PfmModifyUserRoleTo;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;
import rebue.suc.mo.SucUserMo;

/**
 * 用户角色
 *
 * @mbg.removeField _uniqueFilesName
 */
@RestController
public class PfmUserRoleCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final Logger _log = LoggerFactory.getLogger(PfmUserRoleCtrl.class);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private PfmUserRoleSvc svc;

    /**
     * 查询用户角色
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/pfm/userrole")
    PageInfo<PfmUserRoleMo> list(PfmUserRoleMo mo, @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 5;
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
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/pfm/userrole/getbyid")
    PfmUserRoleMo getById(@RequestParam("id") java.lang.Long id) {
        _log.info("get PfmUserRoleMo by id: " + id);
        return svc.getById(id);
    }

    @Resource
    private PfmRoleSvc pfmRoleSvc;

    /**
     * 添加用户角色
     *
     * @mbg.overrideByMethodName
     */
    @PostMapping("/pfm/userrole")
    Ro add(@RequestBody PfmUserRoleMo mo) throws Exception {
        _log.info("add PfmUserRoleMo:" + mo);
        return svc.addEx(mo);
    }

    /**
     * 修改用户角色
     *
     * @mbg.overrideByMethodName
     */
    @PutMapping("/pfm/userrole")
    Ro modify(@RequestBody PfmModifyUserRoleTo to) throws Exception {
        _log.info("modify PfmUserRoleMo:" + to);
        Ro ro = new Ro();
        try {
            return svc.modifyEx(to);
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 删除用户角色
     *
     * @mbg.overrideByMethodName
     */
    @DeleteMapping("/pfm/userrole")
    Ro del(@RequestBody PfmUserRoleMo mo) {
        _log.info("save PfmUserRoleMo:" + mo);
        return svc.delEx(mo);
    }

    /**
     * 查询用户角色信息和角色信息
     */
    @GetMapping("/pfm/userroleandrole")
    PfmUserRoleAndRoleRo userRoleAndRoleList(PfmUserRoleMo mo) {
        _log.info("查询用户角色信息和角色信息的参数为：{}", mo);
        PfmUserRoleAndRoleRo ro = new PfmUserRoleAndRoleRo();
        _log.info("查询用户角色信息的参数为：{}", mo);
        List<PfmUserRoleMo> userRoleList = svc.list(mo);
        _log.info("查询用户角色信息的返回值为：{}", String.valueOf(userRoleList));
        ro.setUserRoleList(userRoleList);
        PfmRoleMo roleMo = new PfmRoleMo();
        roleMo.setSysId(mo.getSysId());
        roleMo.setIsEnabled(true);
        _log.info("查询角色信息的参数为：{}", roleMo);
        List<PfmRoleMo> roleList = pfmRoleSvc.list(roleMo);
        _log.info("查询角色信息的返回值为：{}", String.valueOf(roleList));
        ro.setRoleList(roleList);
        return ro;
    }

    /**
     * 根据系统id和角色id查询用户分页信息
     */
    @GetMapping("/pfm/userrole/listuserbysysidandroleid")
    PageInfo<SucUserMo> listUserBySysIdAndRoleId(String sysId, Long roleId, int pageNum, int pageSize) {
        _log.info("根据系统id和角色id查询分页信息的参数为：sysId={}, roleId={}, pageNum={}, pageSize={}", sysId, roleId, pageNum, pageSize);
        return svc.listUserBySysIdAndRoleId(sysId, roleId, pageNum, pageSize);
    }
}
