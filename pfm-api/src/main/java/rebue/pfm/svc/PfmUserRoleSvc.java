package rebue.pfm.svc;

import java.util.List;

import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.to.RoleMoveUsersTo;
import rebue.pfm.to.UserMoveRolesTo;
import rebue.robotech.svc.MybatisBaseSvc;
import rebue.suc.ro.UsersRo;

/**
 * 用户角色
 */
public interface PfmUserRoleSvc extends MybatisBaseSvc<PfmUserRoleMo, java.lang.Long> {
    /**
     * 获取用户在指定系统下的角色ID列表
     * 
     * @param sysId
     *            系统ID
     * @param userId
     *            用户ID
     */
    List<Long> listRoleIds(String sysId, Long userId);

    /**
     * 获取角色的用户ID列表
     * 
     * @param sysId
     *            系统ID
     * @param roleId
     *            角色ID
     */
    List<Long> listUserIds(Long roleId);

    /**
     * 用户添加角色
     */
    void addUserRoles(UserMoveRolesTo to);

    /**
     * 移除用户的角色
     */
    void delUserRoles(Long userId,List<Long> moveIds);

    /**
     * 角色添加用户
     */
    void addRoleUsers(RoleMoveUsersTo to);

    /**
     * 移除角色的用户
     */
    void delRoleUsers(List<Long> moveIds);

    /**
     * 查询指定角色的已添加的用户列表
     * 
     * @param roleId
     *            角色ID
     * @param keys
     *            模糊查询用户的关键字
     * @param pageNum
     *            第几页
     * @param pageSize
     *            每页大小
     */
    UsersRo listAddedUsers(Long roleId, String keys, Integer pageNum, Integer pageSize);

    /**
     * 查询指定角色的未添加的用户列表
     * 
     * @param roleId
     *            角色ID
     * @param keys
     *            模糊查询用户的关键字
     * @param pageNum
     *            第几页
     * @param pageSize
     *            每页大小
     */
    UsersRo listUnaddedUsers(Long roleId, String keys, Integer pageNum, Integer pageSize);

    /**
     * 查询指定角色的已添加和未添加的用户列表
     * 
     * @param roleId
     *            角色ID
     * @param pageSize
     *            每页大小
     * @param addedKeys
     *            模糊查询已添加用户的关键字
     * @param addedPageNum
     *            已添加用户第几页
     * @param unaddedKeys
     *            模糊查询未添加用户的关键字
     * @param unaddedPageNum
     *            未添加用户第几页
     */
    UsersRo listAddedAndUnaddedUsers(Long roleId, Integer pageSize, String addedKeys, Integer addedPageNum, String unaddedKeys, Integer unaddedPageNum);
    
    
    int updateByUserId(Long oldUserId ,Long userId);
//    /**
//     * 添加用户角色
//     */
//    Ro addEx(PfmUserRoleMo mo);
//
//    /**
//     * 设置用户角色
//     *
//     * @param to
//     * @return
//     */
//    Ro modifyEx(PfmModifyUserRoleTo to);
//
//    /**
//     * 删除用户角色
//     *
//     * @param mo
//     * @return
//     */
//    Ro delEx(PfmUserRoleMo mo);
//
}
