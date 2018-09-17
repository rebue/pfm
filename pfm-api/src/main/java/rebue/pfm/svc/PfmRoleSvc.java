package rebue.pfm.svc;

import java.util.List;

import rebue.pfm.mo.PfmRoleMo;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 角色信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface PfmRoleSvc extends MybatisBaseSvc<PfmRoleMo, java.lang.Long> {

    /**
     * 删除角色
     */
    Ro delEx(long id);

    /**
     * 设置角色是否启用
     */
    Ro enable(PfmRoleMo mo);

    /**
     * 获取指定系统的角色列表
     */
    List<PfmRoleMo> listBySysId(String sysId);

}
