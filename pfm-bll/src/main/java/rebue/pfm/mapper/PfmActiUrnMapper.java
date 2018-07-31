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
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insert(PfmActiUrnMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insertSelective(PfmActiUrnMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    PfmActiUrnMo selectByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKeySelective(PfmActiUrnMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKey(PfmActiUrnMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmActiUrnMo> selectAll();

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmActiUrnMo> selectSelective(PfmActiUrnMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existSelective(PfmActiUrnMo record);

    /**
     *  根据动作Ｉｄ删除动作链接
     *  @return
     */
    @Delete("delete from PFM_ACTI_URN where ACTI_ID = #{actiId,jdbcType=BIGINT}")
    int deleteByActiId(@Param("actiId") long actiId);
}
