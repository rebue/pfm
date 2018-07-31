package rebue.pfm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.pfm.mo.PfmUserRoleMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface PfmUserRoleMapper extends MybatisBaseMapper<PfmUserRoleMo, Long> {

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insert(PfmUserRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int insertSelective(PfmUserRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    PfmUserRoleMo selectByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKeySelective(PfmUserRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    int updateByPrimaryKey(PfmUserRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmUserRoleMo> selectAll();

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    List<PfmUserRoleMo> selectSelective(PfmUserRoleMo record);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    自动生成，如需修改，请删除本行 @mbg.generated
     */
    boolean existSelective(PfmUserRoleMo record);
}
