package rebue.pfm.svc;

import com.github.pagehelper.PageInfo;
import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.to.PfmModifyUserRoleTo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;
import rebue.suc.mo.SucUserMo;

/**
 * 用户角色
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmUserRoleSvc extends MybatisBaseSvc<PfmUserRoleMo, java.lang.Long> {

    /**
     * 添加用户角色
     */
    Ro addEx(PfmUserRoleMo mo);

    /**
     * 设置用户角色
     *
     * @param to
     * @return
     */
    Ro modifyEx(PfmModifyUserRoleTo to);

    /**
     * 删除用户角色
     *
     * @param mo
     * @return
     */
    Ro delEx(PfmUserRoleMo mo);

    /**
     * 根据系统id和角色id查询用户分页信息
     *
     * @param sysId
     * @param roleId
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<SucUserMo> listUserBySysIdAndRoleId(String sysId, Long roleId, int pageNum, int pageSize);
}
