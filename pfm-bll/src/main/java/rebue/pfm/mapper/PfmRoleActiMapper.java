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
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insert(PfmRoleActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insertSelective(PfmRoleActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    PfmRoleActiMo selectByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKeySelective(PfmRoleActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKey(PfmRoleActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmRoleActiMo> selectAll();

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmRoleActiMo> selectSelective(PfmRoleActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
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
