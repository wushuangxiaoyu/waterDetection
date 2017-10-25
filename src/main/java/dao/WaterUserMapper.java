package dao;

import entity.WaterUser;
import entity.WaterUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterUserMapper {
    int countByExample(WaterUserExample example);

    int deleteByExample(WaterUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WaterUser record);

    int insertSelective(WaterUser record);

    List<WaterUser> selectByExample(WaterUserExample example);

    WaterUser selectByPrimaryKey(Integer id);

    WaterUser selectByUserName(String userName);

    int updateByExampleSelective(@Param("record") WaterUser record, @Param("example") WaterUserExample example);

    int updateByExample(@Param("record") WaterUser record, @Param("example") WaterUserExample example);

    int updateByPrimaryKeySelective(WaterUser record);

    int updateByPrimaryKey(WaterUser record);
}