package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import rebue.pfm.mo.PfmActiMenuMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmActiMenuMapper extends MybatisBaseMapper<PfmActiMenuMo, Long> {

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insert(PfmActiMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insertSelective(PfmActiMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    PfmActiMenuMo selectByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKeySelective(PfmActiMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKey(PfmActiMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmActiMenuMo> selectAll();

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmActiMenuMo> selectSelective(PfmActiMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existSelective(PfmActiMenuMo record);

    /**
     *  根据动作ｉｄ删除动作菜单
     *  @param actiId
     *  @return
     */
    @Delete("DELETE FROM PFM_ACTI_MENU WHERE ACTI_ID = #{actiId,jdbcType=BIGINT}")
    int deleteByActiId(@Param("actiId") long actiId);
}
