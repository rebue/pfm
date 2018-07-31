package rebue.pfm.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 菜单信息
 *
 * 数据库表: PFM_MENU
 *
 * 自动生成，如需修改，请删除本行 @mbg.generated
 */
@JsonInclude(Include.NON_NULL)
public class PfmMenuMo implements Serializable {

    /**
     *    菜单ID
     *
     *    数据库字段: PFM_MENU.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Long id;

    /**
     *    系统ID
     *
     *    数据库字段: PFM_MENU.SYS_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String sysId;

    /**
     *    菜单编码
     *
     *    数据库字段: PFM_MENU.CODE
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String code;

    /**
     *    菜单名称
     *
     *    数据库字段: PFM_MENU.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String name;

    /**
     *    路径
     *
     *    数据库字段: PFM_MENU.PATH
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String path;

    /**
     *    是否启用
     *
     *    数据库字段: PFM_MENU.IS_ENABLED
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private Boolean isEnabled;

    /**
     *    菜单图标
     *
     *    数据库字段: PFM_MENU.ICON
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String icon;

    /**
     *    菜单备注
     *
     *    数据库字段: PFM_MENU.REMARK
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private String remark;

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *    菜单ID
     *
     *    数据库字段: PFM_MENU.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     *    菜单ID
     *
     *    数据库字段: PFM_MENU.ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_MENU.SYS_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getSysId() {
        return sysId;
    }

    /**
     *    系统ID
     *
     *    数据库字段: PFM_MENU.SYS_ID
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     *    菜单编码
     *
     *    数据库字段: PFM_MENU.CODE
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     *    菜单编码
     *
     *    数据库字段: PFM_MENU.CODE
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *    菜单名称
     *
     *    数据库字段: PFM_MENU.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     *    菜单名称
     *
     *    数据库字段: PFM_MENU.NAME
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *    路径
     *
     *    数据库字段: PFM_MENU.PATH
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getPath() {
        return path;
    }

    /**
     *    路径
     *
     *    数据库字段: PFM_MENU.PATH
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_MENU.IS_ENABLED
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     *    是否启用
     *
     *    数据库字段: PFM_MENU.IS_ENABLED
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     *    菜单图标
     *
     *    数据库字段: PFM_MENU.ICON
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     *    菜单图标
     *
     *    数据库字段: PFM_MENU.ICON
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *    菜单备注
     *
     *    数据库字段: PFM_MENU.REMARK
     *
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     *    菜单备注
     *
     *    数据库字段: PFM_MENU.REMARK
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", icon=").append(icon);
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
        PfmMenuMo other = (PfmMenuMo) that;
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
