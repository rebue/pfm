package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Database Table Remarks:
 *   用户角色
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PFM_USER_ROLE
 *
 * @mbg.generated do_not_delete_during_merge 2018-07-28 15:15:40
 */
@ApiModel(value = "PfmUserRoleMo", description = "用户角色")
@JsonInclude(Include.NON_NULL)
public class PfmUserRoleMo implements Serializable {

    /**
     * Database Column Remarks:
     *   用户角色ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_USER_ROLE.ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    @ApiModelProperty(value = "用户角色ID")
    private Long id;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_USER_ROLE.USER_ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * Database Column Remarks:
     *   角色ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_USER_ROLE.ROLE_ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PFM_USER_ROLE
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_USER_ROLE.ID
     *
     * @return the value of PFM_USER_ROLE.ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_USER_ROLE.ID
     *
     * @param id the value for PFM_USER_ROLE.ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_USER_ROLE.USER_ID
     *
     * @return the value of PFM_USER_ROLE.USER_ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_USER_ROLE.USER_ID
     *
     * @param userId the value for PFM_USER_ROLE.USER_ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_USER_ROLE.ROLE_ID
     *
     * @return the value of PFM_USER_ROLE.ROLE_ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_USER_ROLE.ROLE_ID
     *
     * @param roleId the value for PFM_USER_ROLE.ROLE_ID
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_USER_ROLE
     *
     * @mbg.generated 2018-07-28 15:15:40
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_USER_ROLE
     *
     * @mbg.generated 2018-07-28 15:15:40
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_USER_ROLE
     *
     * @mbg.generated 2018-07-28 15:15:40
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}