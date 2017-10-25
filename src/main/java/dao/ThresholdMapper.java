package dao;

import entity.Threshold;
import entity.ThresholdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThresholdMapper {
    int countByExample(ThresholdExample example);

    int deleteByExample(ThresholdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Threshold record);

    int insertSelective(Threshold record);

    List<Threshold> selectByExample(ThresholdExample example);

    Threshold selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Threshold record, @Param("example") ThresholdExample example);

    int updateByExample(@Param("record") Threshold record, @Param("example") ThresholdExample example);

    int updateByPrimaryKeySelective(Threshold record);

    int updateByPrimaryKey(Threshold record);
}