package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 系统信息
 *
 * 数据库表: PFM_SYS
 *
 * 自动生成，如需修改，请删除本行 @mbg.generated
 */
@JsonInclude(Include.NON_NULL)
public class PfmSysMo implements Serializable {

    /**
     *    系统ID
     *
     *    数据库字段: PFM_SYS.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String id;

    /**
     *    系统名称
     *
     *    数据库字段: PFM_SYS.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String name;

    /**
     *    系统备注
     *
     *    数据库字段: PFM_SYS.REMARK
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String remark;

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *    系统ID
     *
     *    数据库字段: PFM_SYS.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_SYS.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *    系统名称
     *
     *    数据库字段: PFM_SYS.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     *    系统名称
     *
     *    数据库字段: PFM_SYS.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *    系统备注
     *
     *    数据库字段: PFM_SYS.REMARK
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     *    系统备注
     *
     *    数据库字段: PFM_SYS.REMARK
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
        sb.append(", name=").append(name);
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
        PfmSysMo other = (PfmSysMo) that;
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
