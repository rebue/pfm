package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import rebue.pfm.mo.PfmRoleActiMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmRoleActiMapper extends MybatisBaseMapper<PfmRoleActiMo, Long> {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    int insert(PfmRoleActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    int insertSelective(PfmRoleActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    PfmRoleActiMo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    int updateByPrimaryKeySelective(PfmRoleActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    int updateByPrimaryKey(PfmRoleActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    List<PfmRoleActiMo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    List<PfmRoleActiMo> selectSelective(PfmRoleActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    boolean existByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ROLE_ACTI
     *
     * @mbg.generated 2018-07-28 16:22:22
     */
    boolean existSelective(PfmRoleActiMo record);

    /**
     *  根据角色ｉｄ删除角色动作信息
     *
     *  @param roleId
     *  @return
     */
    @Delete("delete from PFM_ROLE_ACTI where ROLE_ID = #{roleId,jdbcType=BIGINT}")
    int deleteByRoleId(@Param("roleId") long roleId);
}
