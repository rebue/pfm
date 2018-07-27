package rebue.pfm.svc.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import rebue.pfm.mapper.PfmActiMenuMapper;
import rebue.pfm.mo.PfmActiMenuMo;
import rebue.pfm.ro.PfmActiMenuRo;
import rebue.pfm.svc.PfmActiMenuSvc;
import rebue.pfm.to.PfmModifyActimenuTo;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

/**
 * 动作菜单
 * 
 * @author lbl
 *
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class PfmActiMenuSvcImpl extends MybatisBaseSvcImpl<PfmActiMenuMo, java.lang.Long, PfmActiMenuMapper>
		implements PfmActiMenuSvc {

	private final static Logger _log = LoggerFactory.getLogger(PfmActiMenuSvcImpl.class);

	/**
	 * 查询动作菜单
	 * 
	 * @param mo
	 * @return
	 */
	@Override
	public List<PfmActiMenuMo> list(PfmActiMenuMo mo) {
		_log.info("查询动作菜单的参数为：{}", mo);
		return _mapper.selectSelective(mo);
	}

	/**
	 * 设置动作菜单
	 * 
	 * @param to
	 * @return
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PfmActiMenuRo modify(PfmModifyActimenuTo to) {
		_log.info("设置动作菜单的请求参数为：{}", to);
		PfmActiMenuRo ro = new PfmActiMenuRo();
		_log.info("设置动作菜单根据动作ｉｄ删除动作菜单的参数为：{}", to.getActiId());
		_mapper.deleteByActiId(to.getActiId());
		String[] menuIds = to.getMenuIds();
		for (int i = 0; i < menuIds.length; i++) {
			PfmActiMenuMo mo = new PfmActiMenuMo();
			try {
				mo.setId(_idWorker.getId());
				mo.setActiId(to.getActiId());
				mo.setMenuId(Long.parseLong(String.valueOf(menuIds[i])));
				_log.info("设置动作菜单添加动作菜单的参数为：{}", mo);
				int insertResult = _mapper.insert(mo);
				_log.info("设置动作菜单添加动作菜单的返回值为:{}", insertResult);
				if (insertResult != 1) {
					_log.error("设置动作菜单失败，动作ｉｄ为：{}", to.getActiId());
					throw new RuntimeException("设置失败");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		_log.info("设置动作菜单成功．动作编号为：{}", to.getActiId());
		ro.setResult(1);
		ro.setMsg("设置成功");
		return ro;
	}
}
