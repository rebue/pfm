package rebue.pfm.to;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * 用户移动角色的传输对象
 */
@JsonInclude(Include.NON_NULL)
@Data
public class UserMoveRolesTo {
    /**
     * 组织ID
     */
    private String     sysId;
    /**
     * 用户ID
     */
    private Long       userId;

    /**
     * 移动角色的ID列表
     */
    private List<Long> moveIds;
}
