package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.pfm.mo.PfmSysMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmSysMapper extends MybatisBaseMapper<PfmSysMo, String> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(String id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(PfmSysMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(PfmSysMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    PfmSysMo selectByPrimaryKey(String id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(PfmSysMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(PfmSysMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmSysMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<PfmSysMo> selectSelective(PfmSysMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(String id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(PfmSysMo record);
}
