package rebue.pfm.svc;

import rebue.pfm.ro.PfmCurrentUserRo;
import rebue.pfm.ro.PfmUserLoginRo;
import rebue.suc.to.LoginByUserNameTo;

public interface PfmUserLoginSvc {
    /**
     * 用户登录(用户名称)
     */
    PfmUserLoginRo loginByUserName(LoginByUserNameTo loginTo);

    /**
     * 用户登录(用户名称)
     */
    PfmUserLoginRo loginByBussinessName(LoginByUserNameTo loginTo);

    /**
     * 获取当前用户信息
     */
    PfmCurrentUserRo getCurrentUser(String sysId);
}
