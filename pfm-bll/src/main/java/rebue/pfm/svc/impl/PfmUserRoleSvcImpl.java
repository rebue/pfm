package rebue.pfm.svc.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.pfm.mapper.PfmUserRoleMapper;
import rebue.pfm.mo.PfmUserRoleMo;
import rebue.pfm.ro.PfmUserRoleRo;
import rebue.pfm.svc.PfmUserRoleSvc;
import rebue.pfm.to.PfmModifyUserRoleTo;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

@Service
/**
 * <pre>
 * 在单独使用不带任何参数 的 @Transactional 注释时，
 * propagation(传播模式)=REQUIRED，readOnly=false，
 * isolation(事务隔离级别)=READ_COMMITTED，
 * 而且事务不会针对受控异常（checked exception）回滚。
 * 注意：
 * 一般是查询的数据库操作，默认设置readOnly=true, propagation=Propagation.SUPPORTS
 * 而涉及到增删改的数据库操作的方法，要设置 readOnly=false, propagation=Propagation.REQUIRED
 * </pre>
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class PfmUserRoleSvcImpl extends MybatisBaseSvcImpl<PfmUserRoleMo, java.lang.Long, PfmUserRoleMapper>
		implements PfmUserRoleSvc {

	private static final Logger _log = LoggerFactory.getLogger(PfmUserRoleSvcImpl.class);

	/**
	 * @mbg.generated
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int add(PfmUserRoleMo mo) {
		// 如果id为空那么自动生成分布式id
		if (mo.getId() == null || mo.getId() == 0) {
			mo.setId(_idWorker.getId());
		}
		return super.add(mo);
	}

	/**
	 * 设置用户角色
	 * 
	 * @param to
	 * @return
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PfmUserRoleRo modifyEx(PfmModifyUserRoleTo to) {
		_log.info("设置用户角色的参数为：{}", to);
		PfmUserRoleRo ro = new PfmUserRoleRo();
		_log.info("设置用户角色删除用户角色的参数为：{}", to);
		int deleteByUserIdAndRoleIdResult = _mapper.deleteByUserIdAndRoleId(to.getSysId(), to.getUserId());
		_log.info("设置用户角色删除用户角色的返回值为：{}", deleteByUserIdAndRoleIdResult);
		if (deleteByUserIdAndRoleIdResult < 0) {
			_log.error("设置用户角色删除用户角色时出现错误，用户ｉｄ为：{}", to.getUserId());
			ro.setResult((byte) -1);
			ro.setMsg("设置失败");
			return ro;
		}

		if (to.getRoleIds().length != 0) {
			for (int i = 0; i < to.getRoleIds().length; i++) {
				PfmUserRoleMo mo = new PfmUserRoleMo();
				mo.setRoleId(to.getRoleIds()[i]);
				mo.setSysId(to.getSysId());
				mo.setUserId(to.getUserId());
				_log.info("设置用户角色添加用户角色的参数为：{}", mo);
				int addResult = add(mo);
				_log.info("设置用户角色添加用户角色的返回值为：{}", addResult);
				if (addResult != 1) {
					_log.error("设置用户角色添加用户角色出错，用户ｉｄ为：{}", to.getUserId());
					throw new RuntimeException("设置失败");
				}
			}
		}
		_log.info("设置用户角色成功，用户编号为:{}", to.getUserId());
		ro.setResult((byte) 1);
		ro.setMsg("设置成功");
		return ro;
	}

	/**
	 * 根据系统id和角色id查询用户id
	 * 
	 * @param sysId
	 * @param roleId
	 * @return
	 */
	@Override
	public List<Long> getUseIByRoleIdAndSysId(String sysId, Long roleId) {
		_log.info("查询用户id的参数为：{},{}", sysId, roleId);
		return _mapper.selectUseIByRoleIdAndSysId(sysId, roleId);
	}

	/**
	 * 添加用户角色
	 * 
	 * @param mo
	 * @return
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PfmUserRoleRo addEx(PfmUserRoleMo mo) {
		_log.info("添加用户角色的请求参数为：{}", mo);
		PfmUserRoleRo ro = new PfmUserRoleRo();
		if (mo.getRoleId() == null || mo.getSysId() == null || mo.getUserId() == null) {
			_log.error("添加用户时出现参数错误，用户id为：{}", mo.getUserId());
			ro.setResult((byte) -1);
			ro.setMsg("参数错误");
			return ro;
		}
		_log.info("添加用户角色根据用户id，系统id，角色id查询用户角色是否以存在的参数为：{}", mo);
		// 根据用户id，系统id，角色id查询用户角色是否以存在
		Boolean userRoleFlag = _mapper.existSelective(mo);
		_log.info("添加用户角色根据用户id，系统id，角色id查询用户角色是否以存在的返回值为：{}", userRoleFlag);
		if (userRoleFlag) {
			_log.error("添加用户角色根据用户id，系统id，角色id查询用户角色是否以存在时出现该用户已经是该角色的管理员，用户编号为：{}", mo.getUserId());
			ro.setResult((byte) -1);
			ro.setMsg("该用户已是该角色的管理员");
			return ro;
		}
		_log.info("添加用户角色的参数为：{}", mo);
		int addResult = add(mo);
		_log.info("添加用户角色的返回值为：{}", addResult);
		if (addResult != 1) {
			_log.info("添加用户角色时出现错误，用户编号为:{}", mo.getUserId());
			ro.setResult((byte) -1);
			ro.setMsg("添加失败");
			return ro;
		}
		_log.info("添加用户角色成功，用户编号为:{}", mo.getUserId());
		ro.setResult((byte) 1);
		ro.setMsg("添加成功");
		return ro;
	}

	/**
	 * 删除用户角色
	 * @param mo
	 * @return
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PfmUserRoleRo delEx(PfmUserRoleMo mo) {
		_log.info("删除用户角色的请求参数为：{}", mo);
		PfmUserRoleRo ro = new PfmUserRoleRo();
		if (mo.getUserId() == null || mo.getRoleId() == null || mo.getSysId() == null) {
			_log.error("删除用户角色时出现参数不全，请求的参数为：{}", mo);
			ro.setResult((byte) -1);
			ro.setMsg("删除失败");
			return ro;
		}
		_log.info("删除用户角色的参数为：{}", mo);
		int deleteByUserAndRoleAndSysResult = _mapper.deleteByUserAndRoleAndSys(mo);
		_log.info("删除用户角色的返回值为：{}", deleteByUserAndRoleAndSysResult);
		if (deleteByUserAndRoleAndSysResult != 1) {
			_log.error("删除用户角色失败，用户编号为:{}", mo.getUserId());
			ro.setResult((byte) -1);
			ro.setMsg("删除失败");
			return ro;
		}
		_log.error("删除用户角色成功，用户编号为:{}", mo.getUserId());
		ro.setResult((byte) 1);
		ro.setMsg("删除成功");
		return ro;
	}
}
