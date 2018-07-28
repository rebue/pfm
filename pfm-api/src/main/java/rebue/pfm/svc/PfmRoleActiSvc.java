package rebue.pfm.svc;

import java.util.List;
import rebue.pfm.mo.PfmRoleActiMo;
import rebue.pfm.ro.PfmRoleActiRo;
import rebue.pfm.to.PfmModifyRoleActiTo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface PfmRoleActiSvc extends MybatisBaseSvc<PfmRoleActiMo, java.lang.Long> {

    /**
     *  查询角色功能
     *  @mbg.overrideByMethodName
     */
    List<PfmRoleActiMo> list(PfmRoleActiMo mo);

    /**
     *  设置角色动作
     *  @param to
     *  @return
     *  @mbg.overrideByMethodName
     */
    PfmRoleActiRo modify(PfmModifyRoleActiTo to);
}
