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
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insert(PfmRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insertSelective(PfmRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    PfmRoleMo selectByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKeySelective(PfmRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKey(PfmRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmRoleMo> selectAll();

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmRoleMo> selectSelective(PfmRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existSelective(PfmRoleMo record);

    /**
     *  是否启用角色
     *
     *  @param id
     *  @param isEnabled
     *  @return
     */
    @Update("UPDATE PFM_ROLE SET IS_ENABLED=#{isEnabled,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
    int roleEnabled(@Param("id") Long id, @Param("isEnabled") boolean isEnabled);
}
