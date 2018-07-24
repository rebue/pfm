package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Database Table Remarks:
 *   系统信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PFM_SYS
 *
 * @mbg.generated do_not_delete_during_merge 2018-07-24 10:36:01
 */
@ApiModel(value = "PfmSysMo", description = "系统信息")
@JsonInclude(Include.NON_NULL)
public class PfmSysMo implements Serializable {
    /**
     * Database Column Remarks:
     *   系统ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_SYS.ID
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    @ApiModelProperty(value = "系统ID")
    private String id;

    /**
     * Database Column Remarks:
     *   系统名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_SYS.NAME
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    @ApiModelProperty(value = "系统名称")
    private String name;

    /**
     * Database Column Remarks:
     *   系统备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_SYS.REMARK
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    @ApiModelProperty(value = "系统备注")
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_SYS.ID
     *
     * @return the value of PFM_SYS.ID
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_SYS.ID
     *
     * @param id the value for PFM_SYS.ID
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_SYS.NAME
     *
     * @return the value of PFM_SYS.NAME
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_SYS.NAME
     *
     * @param name the value for PFM_SYS.NAME
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_SYS.REMARK
     *
     * @return the value of PFM_SYS.REMARK
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_SYS.REMARK
     *
     * @param remark the value for PFM_SYS.REMARK
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-24 10:36:01
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
        PfmSysMo other = (PfmSysMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-24 10:36:01
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}