package rebue.pfm.svr.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rebue.sbs.feign.FeignConfig;

/**
 * 用户角色对内接口
 * @author lbl
 *
 */
@FeignClient(name = "pfm-svr", configuration = FeignConfig.class)
public interface PfmUserRoleSvc {

	/**
	 * 查询用户id
	 * 
	 * @param sysId
	 * @param roleId
	 * @return
	 */
	@GetMapping("/pfm/userrole/getuserid")
	List<Long> getUseIdByRoleIdAndSysId(@RequestParam("sysId") String sysId, @RequestParam("roleId") Long roleId);
}
