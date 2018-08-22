package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 角色动作
 *
 * 数据库表: PFM_ROLE_ACTI
 *
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class PfmRoleActiMo implements Serializable {

    /**
     *    角色动作ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    角色ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ROLE_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long roleId;

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ACTI_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long actiId;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    角色动作ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    角色动作ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    角色ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ROLE_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     *    角色ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ROLE_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ACTI_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getActiId() {
        return actiId;
    }

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ROLE_ACTI.ACTI_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setActiId(Long actiId) {
        this.actiId = actiId;
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
        sb.append(", roleId=").append(roleId);
        sb.append(", actiId=").append(actiId);
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
        PfmRoleActiMo other = (PfmRoleActiMo) that;
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
