package rebue.pfm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PfmUrnMapper {

    /**
     * 查询指定用户在某系统中的所拥有的菜单
     */
    @Select("SELECT DISTINCT c.URN FROM  PFM_USER_ROLE a " //
            + " LEFT JOIN PFM_ROLE_ACTI b ON a.ROLE_ID = b.ROLE_ID "//
            + " LEFT JOIN PFM_ACTI_URN c ON b.ACTI_ID = c.ACTI_ID "//
            + "WHERE a.SYS_ID = #{sysId} AND a.USER_ID = #{userId}")
    List<String> selectByUserIdAndSysId(@Param("userId") Long userId, @Param("sysId") String sysId);
}
