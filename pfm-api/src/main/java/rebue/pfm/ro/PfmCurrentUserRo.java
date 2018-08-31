package rebue.pfm.ro;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import rebue.pfm.mo.PfmMenuMo;
import rebue.suc.ro.CurrentUserRo;

@JsonInclude(Include.NON_NULL)
public class PfmCurrentUserRo extends CurrentUserRo {
    /**
     * 用户被授权访问的菜单
     */
    private List<PfmMenuMo> menus;

    /**
     * 用户被授权访问的链接
     */
    private List<String>    urns;

    public List<String> getUrns() {
        return urns;
    }

    public void setUrns(List<String> urns) {
        this.urns = urns;
    }

    public List<PfmMenuMo> getMenus() {
        return menus;
    }

    public void setMenus(List<PfmMenuMo> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "PfmCurrentUserRo [menus=" + menus + ", urns=" + urns + ", getUserId()=" + getUserId() + ", getOrgId()=" + getOrgId() + ", getNickname()=" + getNickname()
                + ", getFace()=" + getFace() + "]";
    }

}
