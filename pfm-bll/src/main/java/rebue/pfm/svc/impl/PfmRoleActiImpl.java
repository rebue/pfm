package rebue.pfm.svc.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import rebue.pfm.mapper.PfmRoleActiMapper;
import rebue.pfm.mo.PfmRoleActiMo;
import rebue.pfm.ro.PfmRoleActiRo;
import rebue.pfm.svc.PfmRoleActiSvc;
import rebue.pfm.to.PfmModifyRoleActiTo;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class PfmRoleActiImpl extends MybatisBaseSvcImpl<PfmRoleActiMo, java.lang.Long, PfmRoleActiMapper>
		implements PfmRoleActiSvc {

	private final static Logger _log = LoggerFactory.getLogger(PfmRoleActiImpl.class);

	/**
	 * 查询角色功能信息
	 */
	@Override
	public List<PfmRoleActiMo> list(PfmRoleActiMo mo) {
		_log.info("查询角色功能信息的参数为：{}", mo);
		return _mapper.selectSelective(mo);
	}
	
	/**
	 * 设置角色动作
	 * @param to
	 * @return
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PfmRoleActiRo modify(PfmModifyRoleActiTo to) {
		_log.info("设置角色动作的参数为：{}", to);
		_log.info("设置角色动作删除角色动作的参数为:{}", to.getRoleId());
		_mapper.deleteByRoleId(to.getRoleId());
		Long[] actiIds = to.getActiIds();
		for (int i = 0; i < actiIds.length; i++) {
			PfmRoleActiMo mo = new PfmRoleActiMo();
			mo.setId(_idWorker.getId());
			mo.setActiId(actiIds[i]);
			mo.setRoleId(to.getRoleId());
			_log.info("设置角色动作的参数为：{}", mo);
			int insertResult = _mapper.insert(mo);
			_log.info("设置角色动作的返回值为:{}", insertResult);
			if (insertResult != 1) {
				_log.error("设置角色动作失败，角色ｉｄ为：{}", to.getRoleId());
				throw new RuntimeException("设置失败");
			}
		}
		PfmRoleActiRo ro = new PfmRoleActiRo();
		ro.setResult(1);
		ro.setMsg("设置成功");
		return ro;
	}
}
