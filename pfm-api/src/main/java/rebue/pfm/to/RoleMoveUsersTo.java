package rebue.pfm.to;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * 角色移动用户的传输对象
 */
@JsonInclude(Include.NON_NULL)
@Data
public class RoleMoveUsersTo {
    /**
     * 系统ID
     */
    private String     sysId;
    /**
     * 角色ID
     */
    private Long       id;

    /**
     * 已添加用户列表的模糊查询的关键字
     */
    private String     addedKeys;

    /**
     * 未添加用户列表的模糊查询的关键字
     */
    private String     unaddedKeys;

    /**
     * 已添加用户列表的页码
     */
    private Integer    addedPageNum;

    /**
     * 未添加用户列表的页码
     */
    private Integer    unaddedPageNum;

    /**
     * 移动用户的ID列表
     */
    private List<Long> moveIds;
}
