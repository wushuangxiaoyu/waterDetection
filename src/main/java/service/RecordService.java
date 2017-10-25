package service;

import entity.WaterRecord;
import entity.WaterRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by  Yu  on  2017/9/28.
 */
public interface RecordService extends BaseService<WaterRecord, WaterRecordExample> {

    List<WaterRecord> getPipelineData(
            @Param("lidu") Integer lidu,
            @Param("eqpId") Integer eqpId,
            @Param("what") Integer what,
            @Param("tongji") Integer tongji,
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
}
