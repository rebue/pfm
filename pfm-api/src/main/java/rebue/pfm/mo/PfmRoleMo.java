package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 角色信息
 *
 * 数据库表: PFM_ROLE
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class PfmRoleMo implements Serializable {

    /**
     *    角色ID
     *
     *    数据库字段: PFM_ROLE.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    系统ID
     *
     *    数据库字段: PFM_ROLE.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String sysId;

    /**
     *    角色名称
     *
     *    数据库字段: PFM_ROLE.NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String name;

    /**
     *    是否启用
     *
     *    数据库字段: PFM_ROLE.IS_ENABLED
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Boolean isEnabled;

    /**
     *    顺序号
     *
     *    数据库字段: PFM_ROLE.ORDER_NO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Byte orderNo;

    /**
     *    角色备注
     *
     *    数据库字段: PFM_ROLE.REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String remark;

    /**
     *    首页路径
     *
     *    数据库字段: PFM_ROLE.INDEX_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String indexPath;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    角色ID
     *
     *    数据库字段: PFM_ROLE.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    角色ID
     *
     *    数据库字段: PFM_ROLE.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_ROLE.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getSysId() {
        return sysId;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_ROLE.SYS_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     *    角色名称
     *
     *    数据库字段: PFM_ROLE.NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getName() {
        return name;
    }

    /**
     *    角色名称
     *
     *    数据库字段: PFM_ROLE.NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_ROLE.IS_ENABLED
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_ROLE.IS_ENABLED
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     *    顺序号
     *
     *    数据库字段: PFM_ROLE.ORDER_NO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getOrderNo() {
        return orderNo;
    }

    /**
     *    顺序号
     *
     *    数据库字段: PFM_ROLE.ORDER_NO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setOrderNo(Byte orderNo) {
        this.orderNo = orderNo;
    }

    /**
     *    角色备注
     *
     *    数据库字段: PFM_ROLE.REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRemark() {
        return remark;
    }

    /**
     *    角色备注
     *
     *    数据库字段: PFM_ROLE.REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     *    首页路径
     *
     *    数据库字段: PFM_ROLE.INDEX_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getIndexPath() {
        return indexPath;
    }

    /**
     *    首页路径
     *
     *    数据库字段: PFM_ROLE.INDEX_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIndexPath(String indexPath) {
        this.indexPath = indexPath;
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
        sb.append(", name=").append(name);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", remark=").append(remark);
        sb.append(", indexPath=").append(indexPath);
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
        PfmRoleMo other = (PfmRoleMo) that;
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
