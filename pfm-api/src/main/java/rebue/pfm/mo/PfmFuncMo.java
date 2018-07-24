package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Database Table Remarks:
 *   功能信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PFM_FUNC
 *
 * @mbg.generated do_not_delete_during_merge 2018-07-24 10:36:03
 */
@ApiModel(value = "PfmFuncMo", description = "功能信息")
@JsonInclude(Include.NON_NULL)
public class PfmFuncMo implements Serializable {
    /**
     * Database Column Remarks:
     *   功能ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_FUNC.ID
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @ApiModelProperty(value = "功能ID")
    private Long id;

    /**
     * Database Column Remarks:
     *   系统ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_FUNC.SYS_ID
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @ApiModelProperty(value = "系统ID")
    private String sysId;

    /**
     * Database Column Remarks:
     *   功能名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_FUNC.NAME
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @ApiModelProperty(value = "功能名称")
    private String name;

    /**
     * Database Column Remarks:
     *   是否启用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_FUNC.IS_ENABLED
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @ApiModelProperty(value = "是否启用")
    private Boolean isEnabled;

    /**
     * Database Column Remarks:
     *   顺序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_FUNC.ORDER_NO
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @ApiModelProperty(value = "顺序号")
    private Byte orderNo;

    /**
     * Database Column Remarks:
     *   功能备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PFM_FUNC.REMARK
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @ApiModelProperty(value = "功能备注")
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_FUNC.ID
     *
     * @return the value of PFM_FUNC.ID
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_FUNC.ID
     *
     * @param id the value for PFM_FUNC.ID
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_FUNC.SYS_ID
     *
     * @return the value of PFM_FUNC.SYS_ID
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_FUNC.SYS_ID
     *
     * @param sysId the value for PFM_FUNC.SYS_ID
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_FUNC.NAME
     *
     * @return the value of PFM_FUNC.NAME
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_FUNC.NAME
     *
     * @param name the value for PFM_FUNC.NAME
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_FUNC.IS_ENABLED
     *
     * @return the value of PFM_FUNC.IS_ENABLED
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_FUNC.IS_ENABLED
     *
     * @param isEnabled the value for PFM_FUNC.IS_ENABLED
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_FUNC.ORDER_NO
     *
     * @return the value of PFM_FUNC.ORDER_NO
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public Byte getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_FUNC.ORDER_NO
     *
     * @param orderNo the value for PFM_FUNC.ORDER_NO
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public void setOrderNo(Byte orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PFM_FUNC.REMARK
     *
     * @return the value of PFM_FUNC.REMARK
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PFM_FUNC.REMARK
     *
     * @param remark the value for PFM_FUNC.REMARK
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysId=").append(sysId);
        sb.append(", name=").append(name);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-24 10:36:03
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
        PfmFuncMo other = (PfmFuncMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}