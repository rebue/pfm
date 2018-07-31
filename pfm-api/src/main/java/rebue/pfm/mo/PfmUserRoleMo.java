package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 用户角色
 *
 * 数据库表: PFM_USER_ROLE
 *
 * 自动生成，如需修改，请删除本行 @mbg.generated
 */
@JsonInclude(Include.NON_NULL)
public class PfmUserRoleMo implements Serializable {

    /**
     *    用户角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long id;

    /**
     *    用户ID
     *
     *    数据库字段: PFM_USER_ROLE.USER_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long userId;

    /**
     *    角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ROLE_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long roleId;

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *    用户角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     *    用户角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    用户ID
     *
     *    数据库字段: PFM_USER_ROLE.USER_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *    用户ID
     *
     *    数据库字段: PFM_USER_ROLE.USER_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *    角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ROLE_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     *    角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ROLE_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PfmUserRoleMo other = (PfmUserRoleMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}
