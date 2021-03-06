package rebue.pfm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import rebue.pfm.mo.PfmActiMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmActiMapper extends MybatisBaseMapper<PfmActiMo, Long> {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int insert(PfmActiMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int insertSelective(PfmActiMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    PfmActiMo selectByPrimaryKey(Long id);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int updateByPrimaryKeySelective(PfmActiMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    int updateByPrimaryKey(PfmActiMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    List<PfmActiMo> selectAll();

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    List<PfmActiMo> selectSelective(PfmActiMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    boolean existByPrimaryKey(Long id);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(PfmActiMo record);

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    boolean existSelective(PfmActiMo record);

    /**
     * 是否启用
     *
     * @param id
     * @param isEnabled
     * @return
     */
    @Update("UPDATE PFM_ACTI SET IS_ENABLED=#{isEnabled,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
    int enabledActionOrNot(@Param("id") Long id, @Param("isEnabled") boolean isEnabled);

    /**
     * 是否鉴权
     * 
     * @param id
     * @param isAuth
     * @return
     */
    @Update("UPDATE PFM_ACTI SET IS_AUTH=#{isAuth,jdbcType=TINYINT} WHERE ID=#{id,jdbcType=BIGINT}")
    int whetherTheAuthentication(@Param("id") Long id, @Param("isAuth") Boolean isAuth);
}
