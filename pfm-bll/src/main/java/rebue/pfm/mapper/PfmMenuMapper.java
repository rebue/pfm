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
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insert(PfmMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insertSelective(PfmMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    PfmMenuMo selectByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKeySelective(PfmMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKey(PfmMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmMenuMo> selectAll();

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmMenuMo> selectSelective(PfmMenuMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
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
