package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.pfm.mo.PfmActiMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmActiMapper extends MybatisBaseMapper<PfmActiMo, Long> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    int insert(PfmActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    int insertSelective(PfmActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    PfmActiMo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    int updateByPrimaryKeySelective(PfmActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    int updateByPrimaryKey(PfmActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    List<PfmActiMo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    List<PfmActiMo> selectSelective(PfmActiMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    boolean existByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_ACTI
     *
     * @mbg.generated 2018-07-24 10:36:03
     */
    boolean existSelective(PfmActiMo record);
}