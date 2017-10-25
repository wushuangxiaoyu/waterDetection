package controller;

import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.nativejdbc.JBossNativeJdbcExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.EquipmentService;
import service.RecordService;
import service.ThresholdService;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 绘制图的请求
 * 返回json格式
 * Created by  Yu  on  2017/9/27.
 */
@Controller
@RequestMapping("/chart")
public class ChartController {

    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private RecordService recordService;
    @Autowired
    private ThresholdService thresholdService;

    /**
     * 返回实时数据
     * @param eqpId 设备id
     * @param what  需要测的数据 数据 0-PH 1-Oxy 2-Heavy 3-Chy 4-Tmp
     */
    @RequestMapping(value = "/realTime/{eqpId}/{what}",produces = "application/json ; charset=utf-8")
    @ResponseBody
    public Object realTimeData( @PathVariable("eqpId") Integer eqpId,@PathVariable("what") Integer what){
        return equipmentService.getRealTime(eqpId,what);
    }

    /**
     * 返回指定设备指定数据的统计值
     * @param eqpId  设备主键
     * @param lidu   粒度 0-小时 1-日 2-月
     * @param what   数据 0-PH 1-Oxy 2-Heavy 3-Chy 4-Tmp
     * @param tongji  统计 0-最大值 1-最小值 2-平均值
     */
    @RequestMapping(value = "/pipeline/{eqpId}/{what}/{tongji}/{lidu}",produces = "application/json ; charset=utf-8")
    @ResponseBody
    public Object pipeline(@PathVariable("lidu") Integer lidu,@PathVariable("eqpId") Integer eqpId,
                           @PathVariable("what") Integer what, @PathVariable("tongji") Integer tongji,
                           HttpServletRequest request,
                            long startTime,long endTime){

        String s= (String) request.getAttribute("startTime");
        //Long startTime = (Long) request.getAttribute("startTime");
        Date start=new Date(startTime);
        //Long endTime = (Long) request.getAttribute("endTime");
        Date end=new Date(endTime);

        List<WaterRecord> list = recordService.getPipelineData(lidu, eqpId, what, tongji, start, end);

        return list;
    }


    /**
     *返回饼图数据
     */
    @RequestMapping(value = "/getPieData/{eqpId}",produces = "application/json ; charset=utf-8")
    @ResponseBody
    public Object getPieData(@PathVariable("eqpId") Integer eqpId){
        Map<String,List<PieBean>> map=new HashMap<String, List<PieBean>>();
        Calendar c=Calendar.getInstance();
        c.add(c.DAY_OF_MONTH,1);
        Date end =c.getTime();
        c.add(c.DAY_OF_MONTH,-30);
        Date start=c.getTime();

        WaterEquipment waterEquipment=equipmentService.selectByPrimaryKey(eqpId);

        ThresholdExample thresholdExample= new ThresholdExample();
        thresholdExample.or().andWaterEqpIdEqualTo(eqpId);
        Threshold threshold = thresholdService.selectFirstByExample(thresholdExample);
        List<WaterRecord> list=recordService.getPieData(eqpId,start,end);

        return getPieArrayList(list,threshold);
    }


    private Map<String,List<PieBean>> getPieArrayList(List<WaterRecord> records,Threshold threshold){
        if(records==null)
            return null;
        List<List<PieBean>> list=new ArrayList<List<PieBean>>();
        for(int i=0;i<=4;i++) {
            list.add(new ArrayList<PieBean>());
            list.get(i).add(new PieBean("超过阈值", 0));
            list.get(i).add(new PieBean("阈值内", 0));
            list.get(i).add(new PieBean("低于阈值", 0));
        }
        for (WaterRecord record :records) {
            //0-Ph
            if(record.getWaterPh()!=null) {
                if (record.getWaterPh() > threshold.getMaxPh())
                    list.get(0).get(0).addOne();
                else if (record.getWaterPh() < threshold.getMinPh())
                    list.get(0).get(2).addOne();
                else
                    list.get(0).get(1).addOne();
            }
            // 1-Oxy
            if(record.getWaterOxy()!=null) {
                if (record.getWaterOxy() > threshold.getMaxOxy())
                    list.get(1).get(0).addOne();
                else if (record.getWaterOxy() < threshold.getMinOxy())
                    list.get(1).get(2).addOne();
                else
                    list.get(1).get(1).addOne();
            }
            //2-Heavy
            if(record.getWaterHeavy()!=null) {
                if (record.getWaterHeavy() > threshold.getMaxHeavy())
                    list.get(2).get(0).addOne();
                else if (record.getWaterHeavy() < threshold.getMinHeavy())
                    list.get(2).get(2).addOne();
                else
                    list.get(2).get(1).addOne();
            }
            // 3-Chy  4-Tmp
            if(record.getWaterTmp()!=null) {
                if (record.getWaterTmp() > threshold.getMaxTmp())
                    list.get(4).get(0).addOne();
                else if (record.getWaterTmp() < threshold.getMinTmp())
                    list.get(4).get(2).addOne();
                else
                    list.get(4).get(1).addOne();
            }

            if(record.getWaterChy()!=null) {
                if (record.getWaterChy() > threshold.getMaxChy())
                    list.get(3).get(0).addOne();
                else if (record.getWaterChy() < threshold.getMinChy())
                    list.get(3).get(2).addOne();
                else
                    list.get(3).get(1).addOne();
            }
        }
        Map<String,List<PieBean>> map =new HashMap<String, List<PieBean>>();
        if(list.get(0).get(0).getValue()!=0||list.get(0).get(1).getValue()!=0||list.get(0).get(2).getValue()!=0)
            map.put("m_ph",list.get(0));
        else
            map.put("m_ph",null);
        if(list.get(1).get(0).getValue()!=0||list.get(1).get(1).getValue()!=0||list.get(1).get(2).getValue()!=0)
            map.put("m_oxy",list.get(1));
        else
            map.put("m_oxy",null);
        if(list.get(2).get(0).getValue()!=0||list.get(2).get(1).getValue()!=0||list.get(2).get(2).getValue()!=0)
            map.put("m_heavy",list.get(2));
        else
            map.put("m_heavy",null);
        if(list.get(3).get(0).getValue()!=0||list.get(3).get(1).getValue()!=0||list.get(3).get(2).getValue()!=0)
            map.put("m_chy",list.get(3));
        else
            map.put("m_chy",null);
        if(list.get(4).get(0).getValue()!=0||list.get(4).get(1).getValue()!=0||list.get(4).get(2).getValue()!=0)
            map.put("m_tmp",list.get(4));
        else
            map.put("m_tmp",null);
        return map;
    }
}
