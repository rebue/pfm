package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import rebue.pfm.mo.PfmFuncMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmFuncMapper extends MybatisBaseMapper<PfmFuncMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmFuncMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmFuncMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmFuncMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmFuncMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmFuncMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmFuncMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmFuncMo> selectSelective(PfmFuncMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(PfmFuncMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(PfmFuncMo record);

    /**
     *  是否启用功能
     *
     *  @param id
     *  @param isEnabled
     *  @return
     */
    @Update("UPDATE PFM_FUNC SET IS_ENABLED=#{isEnabled,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
    int functionEnabled(@Param("id") Long id, @Param("isEnabled") boolean isEnabled);
}
