package rebue.pfm.ctrl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rebue.pfm.ro.PfmCurrentUserRo;
import rebue.pfm.ro.PfmUserLoginRo;
import rebue.pfm.svc.PfmUserLoginSvc;
import rebue.suc.dic.LoginResultDic;
import rebue.suc.to.LoginByUserNameTo;
import rebue.wheel.turing.JwtUtils;

@RestController
public class PfmUserLoginCtrl {

    private static final Logger _log = LoggerFactory.getLogger(PfmUserLoginCtrl.class);

    @Resource
    private PfmUserLoginSvc     svc;

    /**
     * 用户登录(用户名称)
     */
    @PostMapping("/user/login/by/user/name")
    PfmUserLoginRo loginByUserName(@RequestBody LoginByUserNameTo loginTo, HttpServletRequest req, HttpServletResponse resp) {
        _log.info("loginByUserName: {}", loginTo);
        //添加领域Id，后台只有平台和商家商家能登陆
        List<String> domainId = new ArrayList<String>();
        domainId.add("bussines");
        domainId.add("platform");        
        loginTo.setDomainId(domainId);
        
        PfmUserLoginRo ro = svc.loginByUserName(loginTo);
        if (LoginResultDic.SUCCESS.equals(ro.getResult())) {
            JwtUtils.addCookie(ro.getSign(), ro.getExpirationTime(), resp);
        }
        return ro;
    }

    /**
     * 获取当前用户信息
     */
    @GetMapping("/user/currentuser")
    PfmCurrentUserRo getCurrentUser(HttpServletRequest req) throws ParseException {
        _log.info("getCurrentUser");
        // 从签名中获取系统ID
        String sysId = JwtUtils.getJwtSysIdInCookie(req);
        return svc.getCurrentUser(sysId);
    }

}
