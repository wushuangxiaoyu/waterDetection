package service.serviceImpl;

import dao.WaterEquipmentMapper;
import entity.HighChartData;
import entity.WaterEquipment;
import entity.WaterEquipmentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BaseService;
import service.EquipmentService;

import java.util.List;

/**
 * Created by  Yu  on  2017/9/23.
 */
@Service
@interceptor.BaseService
public class EquipmentServiceImpl extends BaseServiceImpl<WaterEquipmentMapper,WaterEquipment, WaterEquipmentExample> implements EquipmentService {
    @Autowired
    private WaterEquipmentMapper waterEquipmentMapper;

    public List<HighChartData> getRealTime(@Param("eqpId") int eqpId, @Param("what") int what){

        return waterEquipmentMapper.getRealTime(eqpId,what);
    }
}
