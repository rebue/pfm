package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 动作菜单
 *
 * 数据库表: PFM_ACTI_MENU
 *
 * 自动生成，如需修改，请删除本行 @mbg.generated
 */
@JsonInclude(Include.NON_NULL)
public class PfmActiMenuMo implements Serializable {

    /**
     *    动作菜单ID
     *
     *    数据库字段: PFM_ACTI_MENU.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long id;

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI_MENU.ACTI_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long actiId;

    /**
     *    菜单ID
     *
     *    数据库字段: PFM_ACTI_MENU.MENU_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long menuId;

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *    动作菜单ID
     *
     *    数据库字段: PFM_ACTI_MENU.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     *    动作菜单ID
     *
     *    数据库字段: PFM_ACTI_MENU.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI_MENU.ACTI_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getActiId() {
        return actiId;
    }

    /**
     *    动作ID
     *
     *    数据库字段: PFM_ACTI_MENU.ACTI_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setActiId(Long actiId) {
        this.actiId = actiId;
    }

    /**
     *    菜单ID
     *
     *    数据库字段: PFM_ACTI_MENU.MENU_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     *    菜单ID
     *
     *    数据库字段: PFM_ACTI_MENU.MENU_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
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
        sb.append(", actiId=").append(actiId);
        sb.append(", menuId=").append(menuId);
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
        PfmActiMenuMo other = (PfmActiMenuMo) that;
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
