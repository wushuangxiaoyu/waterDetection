package controller;

import entity.WaterRecord;
import entity.WaterRecordExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RecordService;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 返回表格请求数据
 * Created by  Yu  on  2017/10/8.
 */
@Controller
@RequestMapping("/table")
public class TableContrller {

    @Autowired
    RecordService recordService;

    @RequestMapping(value = "/getData/{eqpId}",produces = "application/json ; charset=utf-8")
    @ResponseBody
    public Object getData(@PathVariable("eqpId") Integer eqpId, HttpServletRequest request){
        String startTime=request.getParameter("startTime");
        System.out.println(new Date(Long.valueOf(startTime)));
        System.out.println(new Date(Long.valueOf(startTime)+24*60*60*1000));
        //String endTime=request.getParameter("endTime");
        //System.out.println(startTime+endTime);
        WaterRecordExample waterRecordExample=new WaterRecordExample();
        waterRecordExample.or().andTimeBetween(new Date(Long.valueOf(startTime)),new Date(Long.valueOf(startTime)+24*60*60*1000));
        waterRecordExample.setEqpId(eqpId.toString());
        List<WaterRecord> list=recordService.selectByExample(waterRecordExample);
        Map<String,List<WaterRecord>> map = new HashMap<String,List<WaterRecord>>();
        map.put("data",list);
        return map;
    }

}
