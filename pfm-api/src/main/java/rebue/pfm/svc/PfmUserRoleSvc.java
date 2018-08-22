package rebue.pfm.svc;

import com.github.pagehelper.PageInfo;

import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.ro.PfmUserRoleRo;
import rebue.pfm.to.PfmModifyUserRoleTo;
import rebue.robotech.svc.MybatisBaseSvc;
import rebue.suc.mo.SucUserMo;

public interface PfmUserRoleSvc extends MybatisBaseSvc<PfmUserRoleMo, java.lang.Long> {

	/**
	 * 设置用户角色
	 * 
	 * @param to
	 * @return
	 */
	PfmUserRoleRo modifyEx(PfmModifyUserRoleTo to);

	/**
	 * 添加用户角色
	 * @param mo
	 * @return
	 */
	PfmUserRoleRo addEx(PfmUserRoleMo mo);

	/**
	 * 删除用户角色
	 * @param mo
	 * @return
	 */
	PfmUserRoleRo delEx(PfmUserRoleMo mo);

	/**
	 * 根据系统id和角色id查询用户分页信息
	 * @param sysId
	 * @param roleId
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageInfo<SucUserMo> listUserBySysIdAndRoleId(String sysId, Long roleId, int pageNum, int pageSize);
}
