package controller;

import entity.WaterEquipment;
import entity.WaterEquipmentExample;
import entity.WaterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.EquipmentService;
import service.UserService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 用户控制
 * Created by  Yu  on  2017/9/22.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private EquipmentService equipmentService;

    //登录验证
    @RequestMapping("/login")
    public void  login(String userName, String password, HttpServletRequest request,HttpServletResponse response ) throws IOException {
        //InputStream inputStream=null;
        WaterUser waterUser=userService.selectByUserName(userName);
        if(waterUser.getPassword().equals(password)){
            request.getSession().setAttribute("user",waterUser);

            //将该用户的设备存入session
            WaterEquipmentExample waterEquipmentExample=new WaterEquipmentExample();
            waterEquipmentExample.or().andWatIdEqualTo(waterUser.getId());
            List<WaterEquipment> eqps = equipmentService.selectByExample(waterEquipmentExample);
            request.getSession().setAttribute("equipment",eqps);

            //inputStream=new ByteArrayInputStream("Y","utf-8");
            response.getOutputStream().write("Y".getBytes("utf-8"));
        }
        else
           response.getOutputStream().write("N".getBytes("utf-8"));
    }
}
