package dao;

import entity.WaterRecord;
import entity.WaterRecordExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterRecordMapper {
    int countByExample(WaterRecordExample example);

    int deleteByExample(WaterRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WaterRecord record);

    int insertSelective(WaterRecord record);

    List<WaterRecord> selectByExample(WaterRecordExample example);

    WaterRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WaterRecord record, @Param("example") WaterRecordExample example);

    int updateByExample(@Param("record") WaterRecord record, @Param("example") WaterRecordExample example);

    List<WaterRecord> getPipelineData(
            @Param("lidu") int lidu,
            @Param("eqpId") int eqpId,
            @Param("what") int what,
            @Param("tongji") int tongji,
            @Param("start")Date start,
            @Param("end") Date end
    );

    List<WaterRecord> getDataByTime(
            @Param("eqpId") Integer eqpId,
            @Param("start")Date start,
            @Param("end") Date end
    );

    List<WaterRecord> getPieData(
            @Param("eqpId") Integer eqpId,
            @Param("start")Date start,
            @Param("end") Date end
    );

    int updateByPrimaryKeySelective(WaterRecord record);

    int updateByPrimaryKey(WaterRecord record);
}