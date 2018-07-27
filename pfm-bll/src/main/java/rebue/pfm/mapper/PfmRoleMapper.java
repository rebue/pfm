package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import rebue.pfm.mo.PfmRoleMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmRoleMapper extends MybatisBaseMapper<PfmRoleMo, Long> {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	int insert(PfmRoleMo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	int insertSelective(PfmRoleMo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	PfmRoleMo selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	int updateByPrimaryKeySelective(PfmRoleMo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	int updateByPrimaryKey(PfmRoleMo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	List<PfmRoleMo> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	List<PfmRoleMo> selectSelective(PfmRoleMo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	boolean existByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table PFM_ROLE
	 *
	 * @mbg.generated 2018-07-24 10:36:02
	 */
	boolean existSelective(PfmRoleMo record);

	/**
	 * 是否启用角色
	 * 
	 * @param id
	 * @param isEnabled
	 * @return
	 */
	@Update("UPDATE PFM_ROLE SET IS_ENABLED=#{isEnabled,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
	int roleEnabled(@Param("id") Long id, @Param("isEnabled") boolean isEnabled);
}