package rebue.pfm.svc;

import rebue.pfm.mo.PfmRoleMo;
import rebue.pfm.ro.PfmRoleRo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface PfmRoleSvc extends MybatisBaseSvc<PfmRoleMo, java.lang.Long> {

    /**
     *  设置角色是否启用
     *  @param mo
     *  @return
     */
    PfmRoleRo enable(PfmRoleMo mo);

    /**
     *  删除角色
     *  @param id
     *  @return
     */
    PfmRoleRo delEx(long id);
}
