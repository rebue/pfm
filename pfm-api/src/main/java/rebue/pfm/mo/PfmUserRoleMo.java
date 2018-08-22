package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 用户角色
 *
 * 数据库表: PFM_USER_ROLE
 *
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class PfmUserRoleMo implements Serializable {

    /**
     *    系统ID
     *
     *    数据库字段: PFM_USER_ROLE.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String sysId;

    /**
     *    系统ID
     *
     *    数据库字段: PFM_USER_ROLE.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getSysId() {
        return sysId;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_USER_ROLE.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     *    用户角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    用户ID
     *
     *    数据库字段: PFM_USER_ROLE.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long userId;

    /**
     *    角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ROLE_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long roleId;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    用户角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    用户角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    用户ID
     *
     *    数据库字段: PFM_USER_ROLE.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *    用户ID
     *
     *    数据库字段: PFM_USER_ROLE.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *    角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ROLE_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     *    角色ID
     *
     *    数据库字段: PFM_USER_ROLE.ROLE_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}
