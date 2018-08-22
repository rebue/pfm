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
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmActiMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmActiMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmActiMenuMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmActiMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmActiMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmActiMenuMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmActiMenuMo> selectSelective(PfmActiMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
