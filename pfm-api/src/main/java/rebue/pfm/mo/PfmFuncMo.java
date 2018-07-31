package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 功能信息
 *
 * 数据库表: PFM_FUNC
 *
 * 自动生成，如需修改，请删除本行 @mbg.generated
 */
@JsonInclude(Include.NON_NULL)
public class PfmFuncMo implements Serializable {

    /**
     *    功能ID
     *
     *    数据库字段: PFM_FUNC.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long id;

    /**
     *    系统ID
     *
     *    数据库字段: PFM_FUNC.SYS_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String sysId;

    /**
     *    功能名称
     *
     *    数据库字段: PFM_FUNC.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String name;

    /**
     *    是否启用
     *
     *    数据库字段: PFM_FUNC.IS_ENABLED
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Boolean isEnabled;

    /**
     *    顺序号
     *
     *    数据库字段: PFM_FUNC.ORDER_NO
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Byte orderNo;

    /**
     *    功能备注
     *
     *    数据库字段: PFM_FUNC.REMARK
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String remark;

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *    功能ID
     *
     *    数据库字段: PFM_FUNC.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     *    功能ID
     *
     *    数据库字段: PFM_FUNC.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_FUNC.SYS_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getSysId() {
        return sysId;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_FUNC.SYS_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     *    功能名称
     *
     *    数据库字段: PFM_FUNC.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     *    功能名称
     *
     *    数据库字段: PFM_FUNC.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_FUNC.IS_ENABLED
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_FUNC.IS_ENABLED
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     *    顺序号
     *
     *    数据库字段: PFM_FUNC.ORDER_NO
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Byte getOrderNo() {
        return orderNo;
    }

    /**
     *    顺序号
     *
     *    数据库字段: PFM_FUNC.ORDER_NO
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setOrderNo(Byte orderNo) {
        this.orderNo = orderNo;
    }

    /**
     *    功能备注
     *
     *    数据库字段: PFM_FUNC.REMARK
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     *    功能备注
     *
     *    数据库字段: PFM_FUNC.REMARK
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
        PfmFuncMo other = (PfmFuncMo) that;
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
