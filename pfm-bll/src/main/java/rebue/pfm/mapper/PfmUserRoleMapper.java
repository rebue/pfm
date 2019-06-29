package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    int countSelective(PfmUserRoleMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(PfmUserRoleMo record);

    /**
     * 根据角色id删除用户角色
     */
    @Delete("delete from PFM_USER_ROLE where ROLE_ID = #{roleId,jdbcType=BIGINT}")
    int deleteByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据用户id删除用户角色
     */
    @Delete("delete from PFM_USER_ROLE where USER_ID = #{userId,jdbcType=BIGINT}")
    int deleteByUserId(@Param("userId") Long userId);

    /**
     * 根据系统id和用户id查询角色
     */
    @Select("select ROLE_ID from PFM_USER_ROLE where SYS_ID = #{sysId,jdbcType=VARCHAR} and USER_ID = #{userId,jdbcType=BIGINT}")
    List<Long> selectRoleIdBySysIdAndUserId(@Param("sysId") String sysId, @Param("userId") Long userId);

    /**
     * 根据角色id查询用户
     */
    @Select("select USER_ID from PFM_USER_ROLE where ROLE_ID = #{roleId,jdbcType=BIGINT}")
    List<Long> selectUserIdByRoleId(Long roleId);
    
    /**
     * 根据用户id更新信息
     * @param oldUserId
     * @param userId
     * @return
     */
    @Update("update PFM_USER_ROLE set USER_ID=#{userId,jdbcType=BIGINT} where USER_ID=#{oldUserId,jdbcType=BIGINT}")
    int updateByUserId(@Param("oldUserId") Long oldUserId,@Param("userId") Long userId);
}
