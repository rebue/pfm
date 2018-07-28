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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    int insert(PfmFuncMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    int insertSelective(PfmFuncMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    PfmFuncMo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    int updateByPrimaryKeySelective(PfmFuncMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    int updateByPrimaryKey(PfmFuncMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    List<PfmFuncMo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    List<PfmFuncMo> selectSelective(PfmFuncMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
     */
    boolean existByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_FUNC
     *
     * @mbg.generated 2018-07-28 15:15:41
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
