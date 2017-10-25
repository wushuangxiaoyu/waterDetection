package controller;

import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.EquipmentService;
import service.ThresholdService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 设备相关请求
 * Created by  Yu  on  2017/9/27.
 */
@Controller
public class EquipmentController extends BaseController {
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private ThresholdService thresholdService;

    /**
     * 获取设备检测的参数
     */
    @RequestMapping(value = "/getFlag",produces = " application/json ; charset=utf-8")
    @ResponseBody
    public Object getFlag(WaterEquipment waterEquipment){
        waterEquipment =equipmentService.selectByPrimaryKey(waterEquipment.getId());
        int[] a=new int[4];
        Arrays.fill(a,0);
        if(waterEquipment.getFlagPh()==1)
            a[0]=1;
        if(waterEquipment.getFlagTmpOxy()==1)
            a[1]=1;
        if(waterEquipment.getFlagHeavy()==1)
            a[2]=1;
        if(waterEquipment.getFlagChy()==1)
            a[3]=1;
        return a;
    }

    /**
     * 通知清洗设备
     */
    @RequestMapping(value = "/clearEqp/{eqpId}")
    public void clearEqp(@PathVariable("eqpId") Integer eqpId, HttpServletResponse response){
        WaterEquipment waterEquipment=new WaterEquipment();
        waterEquipment.setId(eqpId);
        waterEquipment.setClearnow(1);
        equipmentService.updateByPrimaryKeySelective(waterEquipment);
        try {
            response.getOutputStream().write("Y".getBytes("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 跳转到修改设备参数页面
     */
    @RequestMapping("/control/update/{eqpId}")
    public String controlUpdate(@PathVariable("eqpId") Integer eqpId, HttpServletRequest request){
        WaterEquipment waterEquipment=equipmentService.selectByPrimaryKey(eqpId);
        request.setAttribute("eqp",waterEquipment);

        ThresholdExample thresholdExample= new ThresholdExample();
        thresholdExample.or().andWaterEqpIdEqualTo(eqpId);
        Threshold threshold = thresholdService.selectFirstByExample(thresholdExample);

        request.setAttribute("threshold",threshold);
        return "detail/control.update.jsp";
    }

    /**
     *修改设备参数和阈值
     */
    @RequestMapping(value = "/updateEqp{eqpId}" ,method = RequestMethod.POST )
    public String updateEqp(
            WaterEquipment waterEquipment,
            Threshold threshold,
            @PathVariable("eqpId") Integer eqpId,
            @RequestParam("checkWhat") Integer[] what,
            HttpServletRequest request
    ){
        //System.out.println(what.toString());
        waterEquipment.setId(eqpId);
        threshold.setWaterEqpId(eqpId);
        Set<Integer> set=new HashSet<Integer>(Arrays.asList(what));
        if(set.contains(0))
            waterEquipment.setFlagPh(1);
        else
            waterEquipment.setFlagPh(0);
        if(set.contains(1))
            waterEquipment.setFlagTmpOxy(1);
        else
            waterEquipment.setFlagTmpOxy(0);
        if(set.contains(2))
            waterEquipment.setFlagHeavy(1);
        else
            waterEquipment.setFlagHeavy(0);
        if(set.contains(3))
            waterEquipment.setFlagChy(1);
        else
            waterEquipment.setFlagChy(0);
        equipmentService.updateByPrimaryKeySelective(waterEquipment);
        ThresholdExample thresholdExample=new ThresholdExample();
        thresholdExample.or().andWaterEqpIdEqualTo(eqpId);
        thresholdService.updateByExampleSelective(threshold,thresholdExample);

        //更新Session值
        WaterUser user = (WaterUser) request.getSession().getAttribute("user");
        WaterEquipmentExample waterEquipmentExample=new WaterEquipmentExample();
        waterEquipmentExample.or().andWatIdEqualTo(user.getId());
        List<WaterEquipment> eqps = equipmentService.selectByExample(waterEquipmentExample);
        request.getSession().setAttribute("equipment",eqps);

        return "redirect:/control";
    }

}
