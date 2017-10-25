package service;

import entity.HighChartData;
import entity.WaterEquipment;
import entity.WaterEquipmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by  Yu  on  2017/9/23.
 */
public interface EquipmentService extends BaseService<WaterEquipment, WaterEquipmentExample> {

    public List<HighChartData> getRealTime(@Param("eqpId") int eqpId, @Param("what") int what);
}
