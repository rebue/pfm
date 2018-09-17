package rebue.pfm.ro;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import rebue.pfm.mo.PfmRoleMo;

/**
 * 返回用户的角色列表
 */
@JsonInclude(Include.NON_NULL)
@Data
public class UserRolesRo {
    /**
     * 角色列表
     */
    private List<PfmRoleMo> roles;
    /**
     * 用户的角色ID列表
     */
    private List<Long>      existIds;
}
