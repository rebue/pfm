package rebue.pfm.to;

import lombok.Data;

@Data
public class PfmModifyActimenuTo {

    /**
     * 动作id
     */
    private long     actiId;

    /**
     * 菜单id
     */
    private String[] menuIds;

}
