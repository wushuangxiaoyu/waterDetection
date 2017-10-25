package controller;

import entity.Threshold;
import entity.ThresholdExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ThresholdService;


/**
 * 处理阈值相关请求
 * Created by  Yu  on  2017/9/28.
 */
@Controller
public class ThresholdController {
    @Autowired
    private ThresholdService thresholdService;


    /**
     * 获取设备阈值
     * @param eqpId  设备主键
     */
    @RequestMapping(value = "/getThreshold/{eqpId}",produces = " application/json ; charset=utf-8")
    @ResponseBody
    public Object getThreshold(@PathVariable("eqpId") Integer eqpId){
        ThresholdExample thresholdExample= new ThresholdExample();
        thresholdExample.or().andWaterEqpIdEqualTo(eqpId);
        Threshold threshold = thresholdService.selectFirstByExample(thresholdExample);
        return threshold;
    }
}
