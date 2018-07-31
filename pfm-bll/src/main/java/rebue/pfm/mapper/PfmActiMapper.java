package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import rebue.pfm.mo.PfmActiMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmActiMapper extends MybatisBaseMapper<PfmActiMo, Long> {

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insert(PfmActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insertSelective(PfmActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    PfmActiMo selectByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKeySelective(PfmActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKey(PfmActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmActiMo> selectAll();

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmActiMo> selectSelective(PfmActiMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existSelective(PfmActiMo record);

    @Update("UPDATE PFM_ACTI SET IS_ENABLED=#{isEnabled,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
    int enabledActionOrNot(@Param("id") Long id, @Param("isEnabled") boolean isEnabled);
}
