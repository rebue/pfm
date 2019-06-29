package rebue.pfm.ctrl;

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

import rebue.pfm.ro.UserRolesRo;
import rebue.pfm.svc.PfmRoleSvc;
import rebue.pfm.svc.PfmUserRoleSvc;
import rebue.pfm.to.RoleMoveUsersTo;
import rebue.pfm.to.UserMoveRolesTo;
import rebue.suc.ro.UsersRo;

/**
 * 用户角色
 */
@RestController
public class PfmUserRoleCtrl {

    private static final Logger _log = LoggerFactory.getLogger(PfmUserRoleCtrl.class);

    @Resource
    private PfmUserRoleSvc      svc;
    @Resource
    private PfmRoleSvc          pfmRoleSvc;

    /**
     * 查询用户的角色
     */
    @GetMapping("/pfm/userrole")
    UserRolesRo listUserRoles(@RequestParam("sysId") String sysId, @RequestParam("userId") Long userId) {
        _log.info("listUserRoles: sysId={}, userId={}", sysId, userId);
        UserRolesRo ro = new UserRolesRo();
        ro.setRoles(pfmRoleSvc.listBySysId(sysId));
        ro.setExistIds(svc.listRoleIds(sysId, userId));
        _log.info("ro: " + ro);
        return ro;
    }

    /**
     * 添加用户的角色
     *
     * @mbg.overrideByMethodName
     */
    @PostMapping("/pfm/userrole")
    UserRolesRo add(@RequestBody UserMoveRolesTo to) {
        _log.info("addUserRoles: {}", to);
        svc.addUserRoles(to);
        return listUserRoles(to.getSysId(), to.getUserId());
    }

    /**
     * 移除用户的角色
     *
     * @mbg.overrideByMethodName
     */
    @DeleteMapping("/pfm/userrole")
    UserRolesRo del(@RequestBody UserMoveRolesTo to) {
        _log.info("delUserRoles: {}", to);
        svc.delUserRoles(to.getMoveIds());
        return listUserRoles(to.getSysId(), to.getUserId());
    }

    /**
     * 添加用户到角色中
     *
     * @mbg.overrideByMethodName
     */
    @PostMapping("/pfm/roleuser")
    UsersRo addUsers(@RequestBody RoleMoveUsersTo to) {
        _log.info("addUsers: {}", to);
        svc.addRoleUsers(to);
        return svc.listAddedAndUnaddedUsers(to.getId(), 7, to.getAddedKeys(), to.getAddedPageNum(), to.getUnaddedKeys(), to.getUnaddedPageNum());
    }

    /**
     * 从角色中移除用户
     *
     * @mbg.overrideByMethodName
     */
    @DeleteMapping("/pfm/roleuser")
    UsersRo delUsers(@RequestBody RoleMoveUsersTo to) {
        _log.info("delUsers: {}", to);
        svc.delRoleUsers(to.getMoveIds());
        return svc.listAddedAndUnaddedUsers(to.getId(), 7, to.getAddedKeys(), to.getAddedPageNum(), to.getUnaddedKeys(), to.getUnaddedPageNum());
    }

    /**
     * 查询指定角色的已添加的用户列表
     * 
     * @param id
     *            角色ID
     * @param keys
     *            模糊查询用户的关键字
     * @param pageNum
     *            第几页
     * @param pageSize
     *            每页大小
     */
    @GetMapping("/pfm/userrole/listaddedusers")
    UsersRo listAddedUsers(@RequestParam("id") Long id, @RequestParam(value = "keys", required = false) String keys,
            @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 7;
        _log.info("listAddedUsers: id={}, keys={}, pageNum={}, pageSize={}", id, keys, pageNum, pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        return svc.listAddedUsers(id, keys, pageNum, pageSize);
    }

    /**
     * 查询指定角色的未添加的用户列表
     * 
     * @param id
     *            角色ID
     * @param keys
     *            模糊查询用户的关键字
     * @param pageNum
     *            第几页
     * @param pageSize
     *            每页大小
     */
    @GetMapping("/pfm/userrole/listunaddedusers")
    UsersRo listUnaddedUsers(@RequestParam("id") Long id, @RequestParam(value = "keys", required = false) String keys,
            @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 7;
        _log.info("listUnaddedUsers: id={}, keys={}, pageNum={}, pageSize={}", id, keys, pageNum, pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        return svc.listUnaddedUsers(id, keys, pageNum, pageSize);
    }

    /**
     * 查询指定角色的已添加和未添加的用户列表
     * 
     * @param id
     *            角色ID
     * @param pageNum
     *            第几页
     * @param pageSize
     *            每页大小
     */
    @GetMapping("/pfm/userrole/listaddedandunaddedusers")
    UsersRo listAddedAndUnaddedUsers(@RequestParam("id") Long id, @RequestParam(value = "pageNum", required = false) Integer pageNum,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 7;
        _log.info("listAddedAndUnaddedUsers: id={}, pageNum={}, pageSize={}", id, pageNum, pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        return svc.listAddedAndUnaddedUsers(id, pageSize, null, pageNum, null, pageNum);
    }
    
    /**
     * 根据旧用户id替换新用户id
     * @param oldUserId
     * @param userId
     * @return
     */
    @PutMapping("/pfm/userrole/updateByUserId")
    int updateByUserId(@RequestParam("oldUserId") Long oldUserId, @RequestParam("userId") Long userId) {
		_log.info("开始根据旧用户id替换新用户id,参数为：oldUserId-{},userId-{}",oldUserId,userId);
		return svc.updateByUserId(oldUserId, userId);
    }
    
//
//    /**
//     * 删除用户角色
//     *
//     * @mbg.overrideByMethodName
//     */
//    @DeleteMapping("/pfm/userrole")
//    Ro del(@RequestBody PfmUserRoleMo mo) {
//        _log.info("save PfmUserRoleMo:" + mo);
//        return svc.delEx(mo);
//    }

//    /**
//     * 查询用户角色信息和角色信息
//     */
//    @GetMapping("/pfm/userroleandrole")
//    PfmUserRoleAndRoleRo userRoleAndRoleList(PfmUserRoleMo mo) {
//        _log.info("查询用户角色信息和角色信息的参数为：{}", mo);
//        PfmUserRoleAndRoleRo ro = new PfmUserRoleAndRoleRo();
//        _log.info("查询用户角色信息的参数为：{}", mo);
//        List<PfmUserRoleMo> userRoleList = svc.list(mo);
//        _log.info("查询用户角色信息的返回值为：{}", String.valueOf(userRoleList));
//        ro.setUserRoleList(userRoleList);
//        PfmRoleMo roleMo = new PfmRoleMo();
//        roleMo.setSysId(mo.getSysId());
//        roleMo.setIsEnabled(true);
//        _log.info("查询角色信息的参数为：{}", roleMo);
//        List<PfmRoleMo> roleList = pfmRoleSvc.list(roleMo);
//        _log.info("查询角色信息的返回值为：{}", String.valueOf(roleList));
//        ro.setRoleList(roleList);
//        return ro;
//    }
//
//    /**
//     * 根据系统id和角色id查询用户分页信息
//     */
//    @GetMapping("/pfm/userrole/listuserbysysidandroleid")
//    PageInfo<SucUserMo> listUserBySysIdAndRoleId(String sysId, Long roleId, int pageNum, int pageSize) {
//        _log.info("根据系统id和角色id查询分页信息的参数为：sysId={}, roleId={}, pageNum={}, pageSize={}", sysId, roleId, pageNum, pageSize);
//        return svc.listUserBySysIdAndRoleId(sysId, roleId, pageNum, pageSize);
//    }
}
