package rebue.pfm.svc;

import java.util.List;
import rebue.pfm.mo.PfmRoleActiMo;
import rebue.pfm.to.PfmModifyRoleActiTo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 角色动作
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmRoleActiSvc extends MybatisBaseSvc<PfmRoleActiMo, java.lang.Long> {

    /**
     * 查询角色功能
     *
     * @mbg.overrideByMethodName
     */
    @Override
    List<PfmRoleActiMo> list(PfmRoleActiMo mo);

    /**
     * 设置角色动作
     */
    Ro modify(PfmModifyRoleActiTo to);
}
