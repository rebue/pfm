package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Database Table Remarks:
 *   角色动作
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PFM_ROLE_ACTI
 *
 * @mbg.generated do_not_delete_during_merge 2018-07-28 16:10:10
 */
@ApiModel(value = "PfmRoleActiMo", description = "角色动作")
@JsonInclude(Include.NON_NULL)
public class PfmRoleActiMo implements Serializable {

    /**
     * Database Column Remarks:
     *   角色动作ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_ROLE_ACTI.ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    @ApiModelProperty(value = "角色动作ID")
    private Long id;

    /**
     * Database Column Remarks:
     *   角色ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_ROLE_ACTI.ROLE_ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    /**
     * Database Column Remarks:
     *   动作ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_ROLE_ACTI.ACTI_ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    @ApiModelProperty(value = "动作ID")
    private Long actiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_ROLE_ACTI.ID
     *
     * @return the value of PFM_ROLE_ACTI.ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_ROLE_ACTI.ID
     *
     * @param id the value for PFM_ROLE_ACTI.ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_ROLE_ACTI.ROLE_ID
     *
     * @return the value of PFM_ROLE_ACTI.ROLE_ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_ROLE_ACTI.ROLE_ID
     *
     * @param roleId the value for PFM_ROLE_ACTI.ROLE_ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_ROLE_ACTI.ACTI_ID
     *
     * @return the value of PFM_ROLE_ACTI.ACTI_ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    public Long getActiId() {
        return actiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_ROLE_ACTI.ACTI_ID
     *
     * @param actiId the value for PFM_ROLE_ACTI.ACTI_ID
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    public void setActiId(Long actiId) {
        this.actiId = actiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:10:10
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:10:10
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:10:10
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}
