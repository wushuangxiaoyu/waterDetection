package service.serviceImpl;

import dao.WaterRecordMapper;
import entity.WaterRecord;
import entity.WaterRecordExample;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.RecordService;

import java.util.Date;
import java.util.List;


/**
 * Created by  Yu  on  2017/9/28.
 */
@Service
@interceptor.BaseService
public class RecordServiceImpl extends BaseServiceImpl<WaterRecordMapper, WaterRecord,WaterRecordExample> implements RecordService {
    @Autowired
    private  WaterRecordMapper waterRecordMapper;

    public List<WaterRecord> getPipelineData(
            @Param("lidu") Integer lidu,
            @Param("eqpId") Integer eqpId,
            @Param("what") Integer what,
            @Param("tongji") Integer tongji,
            @Param("start")Date start,
            @Param("end") Date end){

        return waterRecordMapper.getPipelineData(lidu,eqpId,what,tongji,start,end);
    }

    public List<WaterRecord> getDataByTime(
            @Param("eqpId") Integer eqpId,
            @Param("start")Date start,
            @Param("end") Date end
    ){
        return waterRecordMapper.getDataByTime(eqpId,start,end);
    }

    public List<WaterRecord> getPieData(
            @Param("eqpId") Integer eqpId,
            @Param("start") Date start,
            @Param("end") Date end
    ){
        return waterRecordMapper.getPieData(eqpId,start,end);
    }
}
