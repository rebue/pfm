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
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmRoleActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmRoleActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmRoleActiMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmRoleActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmRoleActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmRoleActiMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmRoleActiMo> selectSelective(PfmRoleActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(PfmRoleActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
