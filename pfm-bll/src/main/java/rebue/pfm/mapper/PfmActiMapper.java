package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import rebue.pfm.mo.PfmActiMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmActiMapper extends MybatisBaseMapper<PfmActiMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmActiMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmActiMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmActiMo> selectSelective(PfmActiMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(PfmActiMo record);
    
    /**
     * 获取指定系统的最大OrderNo
     */
    @Select("SELECT COUNT(*) FROM PFM_ACTI WHERE FUNC_ID=#{funcId}")
    public int getCountByFuncId(@Param("funcId") Long funcId);


    /**
     *  是否启用
     *
     *  @param id
     *  @param isEnabled
     *  @return
     */
    @Update("UPDATE PFM_ACTI SET IS_ENABLED=#{isEnabled,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
    int enabledActionOrNot(@Param("id") Long id, @Param("isEnabled") boolean isEnabled);

    /**
     *  是否鉴权
     *  @param id
     *  @param isAuth
     *  @return
     */
    @Update("UPDATE PFM_ACTI SET IS_AUTH=#{isAuth,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
    int whetherTheAuthentication(@Param("id") Long id, @Param("isAuth") Boolean isAuth);
}
