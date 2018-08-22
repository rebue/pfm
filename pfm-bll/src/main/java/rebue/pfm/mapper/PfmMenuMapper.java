package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import rebue.pfm.mo.PfmMenuMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmMenuMapper extends MybatisBaseMapper<PfmMenuMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmMenuMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmMenuMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmMenuMo> selectSelective(PfmMenuMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(PfmMenuMo record);

    /**
     *  是否启用菜单
     *
     *  @return
     */
    @Update("UPDATE PFM_MENU SET IS_ENABLED=#{isEnabled,jdbcType=TINYINT} WHERE CODE LIKE '${code}%'")
    int whetherToEnableMenu(@Param("code") String code, @Param("isEnabled") boolean isEnabled);

    /**
     *  根据ｃｏｄｅ删除菜单
     *  @param code
     *  @return
     */
    @Delete("DELETE FROM PFM_MENU WHERE CODE LIKE '${code}%'")
    int deleteByCode(@Param("code") String code);
}
