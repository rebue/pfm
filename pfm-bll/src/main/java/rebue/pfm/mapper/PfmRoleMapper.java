package rebue.pfm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import rebue.pfm.mo.PfmRoleMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmRoleMapper extends MybatisBaseMapper<PfmRoleMo, Long> {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int insert(PfmRoleMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int insertSelective(PfmRoleMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    PfmRoleMo selectByPrimaryKey(Long id);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int updateByPrimaryKeySelective(PfmRoleMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int updateByPrimaryKey(PfmRoleMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    List<PfmRoleMo> selectAll();

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    List<PfmRoleMo> selectSelective(PfmRoleMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    boolean existByPrimaryKey(Long id);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    boolean existSelective(PfmRoleMo record);

    /**
     * 获取指定系统的角色列表
     */
    @Select("SELECT * FROM PFM_ROLE WHERE SYS_ID=#{sysId} ORDER BY ORDER_NO")
    public List<PfmRoleMo> listBySysId(@Param("sysId") String sysId);

    /**
     * 获取指定系统的最大OrderNo
     */
    @Select("SELECT COUNT(*) FROM PFM_ROLE WHERE SYS_ID=#{sysId}")
    public int getCountBySysId(@Param("sysId") String sysId);

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
