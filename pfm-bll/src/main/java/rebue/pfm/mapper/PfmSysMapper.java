package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.pfm.mo.PfmSysMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmSysMapper extends MybatisBaseMapper<PfmSysMo, String> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    int insert(PfmSysMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    int insertSelective(PfmSysMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    PfmSysMo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    int updateByPrimaryKeySelective(PfmSysMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    int updateByPrimaryKey(PfmSysMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    List<PfmSysMo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    List<PfmSysMo> selectSelective(PfmSysMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    boolean existByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PFM_SYS
     *
     * @mbg.generated 2018-07-13 10:21:33
     */
    boolean existSelective(PfmSysMo record);
}