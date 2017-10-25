package dao;

import entity.HighChartData;
import entity.WaterEquipment;
import entity.WaterEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterEquipmentMapper {
    int countByExample(WaterEquipmentExample example);

    int deleteByExample(WaterEquipmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WaterEquipment record);

    int insertSelective(WaterEquipment record);

    List<WaterEquipment> selectByExample(WaterEquipmentExample example);

    WaterEquipment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WaterEquipment record, @Param("example") WaterEquipmentExample example);

    int updateByExample(@Param("record") WaterEquipment record, @Param("example") WaterEquipmentExample example);

    public List<HighChartData> getRealTime(@Param("eqpId") int eqpId, @Param("what") int what);

    int updateByPrimaryKeySelective(WaterEquipment record);

    int updateByPrimaryKey(WaterEquipment record);
}