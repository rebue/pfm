package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 动作信息
 *
 * 数据库表: PFM_ACTI
 *
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class PfmActiMo implements Serializable {

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    系统ID
     *
     *    数据库字段: PFM_ACTI.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String sysId;

    /**
     *    功能ID
     *
     *    数据库字段: PFM_ACTI.FUNC_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long funcId;

    /**
     *    动作名称
     *
     *    数据库字段: PFM_ACTI.NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String name;

    /**
     *    是否鉴权
     *
     *    数据库字段: PFM_ACTI.IS_AUTH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Boolean isAuth;

    /**
     *    是否启用
     *
     *    数据库字段: PFM_ACTI.IS_ENABLED
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Boolean isEnabled;

    /**
     *    顺序号
     *
     *    数据库字段: PFM_ACTI.ORDER_NO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Byte orderNo;

    /**
     *    动作备注
     *
     *    数据库字段: PFM_ACTI.REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String remark;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_ACTI.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getSysId() {
        return sysId;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_ACTI.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     *    功能ID
     *
     *    数据库字段: PFM_ACTI.FUNC_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getFuncId() {
        return funcId;
    }

    /**
     *    功能ID
     *
     *    数据库字段: PFM_ACTI.FUNC_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setFuncId(Long funcId) {
        this.funcId = funcId;
    }

    /**
     *    动作名称
     *
     *    数据库字段: PFM_ACTI.NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getName() {
        return name;
    }

    /**
     *    动作名称
     *
     *    数据库字段: PFM_ACTI.NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *    是否鉴权
     *
     *    数据库字段: PFM_ACTI.IS_AUTH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Boolean getIsAuth() {
        return isAuth;
    }

    /**
     *    是否鉴权
     *
     *    数据库字段: PFM_ACTI.IS_AUTH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIsAuth(Boolean isAuth) {
        this.isAuth = isAuth;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_ACTI.IS_ENABLED
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_ACTI.IS_ENABLED
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     *    顺序号
     *
     *    数据库字段: PFM_ACTI.ORDER_NO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getOrderNo() {
        return orderNo;
    }

    /**
     *    顺序号
     *
     *    数据库字段: PFM_ACTI.ORDER_NO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setOrderNo(Byte orderNo) {
        this.orderNo = orderNo;
    }

    /**
     *    动作备注
     *
     *    数据库字段: PFM_ACTI.REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRemark() {
        return remark;
    }

    /**
     *    动作备注
     *
     *    数据库字段: PFM_ACTI.REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
        sb.append(", sysId=").append(sysId);
        sb.append(", funcId=").append(funcId);
        sb.append(", name=").append(name);
        sb.append(", isAuth=").append(isAuth);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", remark=").append(remark);
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
        PfmActiMo other = (PfmActiMo) that;
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
