package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import rebue.pfm.mo.PfmActiUrnMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmActiUrnMapper extends MybatisBaseMapper<PfmActiUrnMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmActiUrnMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmActiUrnMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmActiUrnMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmActiUrnMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmActiUrnMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmActiUrnMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmActiUrnMo> selectSelective(PfmActiUrnMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(PfmActiUrnMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(PfmActiUrnMo record);

    /**
     * 根据动作ID删除动作链接
     *
     * @return
     */
    @Delete("delete from PFM_ACTI_URN where ACTI_ID = #{actiId,jdbcType=BIGINT}")
    int deleteByActiId(@Param("actiId") long actiId);
}
