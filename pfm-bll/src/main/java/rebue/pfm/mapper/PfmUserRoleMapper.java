package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import rebue.pfm.mo.PfmUserRoleMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmUserRoleMapper extends MybatisBaseMapper<PfmUserRoleMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmUserRoleMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmUserRoleMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmUserRoleMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmUserRoleMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmUserRoleMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmUserRoleMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmUserRoleMo> selectSelective(PfmUserRoleMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(PfmUserRoleMo record);

    /**
     *  根据系统ｉｄ和用户ｉｄ删除用户角色信息
     *
     *  @param sysId
     *  @param userId
     *  @return
     */
    @Delete("delete from PFM_USER_ROLE where SYS_ID = #{sysId,jdbcType=VARCHAR} and USER_ID = #{userId,jdbcType=BIGINT}")
    int deleteByUserIdAndRoleId(@Param("sysId") String sysId, @Param("userId") Long userId);

    /**
     *  根据系统ｉｄ和角色ｉｄ查询用户
     *  @param sysId
     *  @param roleId
     *  @return
     */
    @Select("select USER_ID from PFM_USER_ROLE where SYS_ID = #{sysId,jdbcType=VARCHAR} and ROLE_ID = #{roleId,jdbcType=BIGINT}")
    List<Long> selectUseIByRoleIdAndSysId(@Param("sysId") String sysId, @Param("roleId") Long roleId);

    /**
     *  根据系统id，角色id，用户id删除用户角色
     *  @param mo
     *  @return
     */
    int deleteByUserAndRoleAndSys(PfmUserRoleMo mo);

    /**
     *  根据角色id删除用户角色
     *  @param roleId
     *  @return
     */
    @Delete("delete from PFM_USER_ROLE where ROLE_ID = #{roleId,jdbcType=BIGINT}")
    int deleteByRoleId(@Param("roleId") Long roleId);
}
