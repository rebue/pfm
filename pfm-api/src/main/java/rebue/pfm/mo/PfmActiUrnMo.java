package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 动作URN
 *
 * 数据库表: PFM_ACTI_URN
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class PfmActiUrnMo implements Serializable {

    /**
     *    动作URN的ID
     *
     *    数据库字段: PFM_ACTI_URN.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI_URN.ACTI_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long actiId;

    /**
     *    URN
     *
     *    数据库字段: PFM_ACTI_URN.URN
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String urn;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    动作URN的ID
     *
     *    数据库字段: PFM_ACTI_URN.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    动作URN的ID
     *
     *    数据库字段: PFM_ACTI_URN.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI_URN.ACTI_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getActiId() {
        return actiId;
    }

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI_URN.ACTI_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setActiId(Long actiId) {
        this.actiId = actiId;
    }

    /**
     *    URN
     *
     *    数据库字段: PFM_ACTI_URN.URN
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getUrn() {
        return urn;
    }

    /**
     *    URN
     *
     *    数据库字段: PFM_ACTI_URN.URN
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setUrn(String urn) {
        this.urn = urn;
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
        sb.append(", actiId=").append(actiId);
        sb.append(", urn=").append(urn);
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
        PfmActiUrnMo other = (PfmActiUrnMo) that;
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
