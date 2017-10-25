package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *  主要跳转类基类
 */
@Controller
public class MainController extends BaseController {

    //显示登陆页面
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

    //显示analysisData.jsp
    @RequestMapping("/analysisData")
    public String analysisData(){
        return "detail/analysisData.jsp";
    }
    //显示pipelineData.jsp
    @RequestMapping("/pipelineData")
    public String pipelineData(){
        return "detail/pipelineData.jsp";
    }
    //显示control.jsp
    @RequestMapping("/control")
    public String gocontrol(){
        return "detail/control.jsp";
    }
    //显示knowledge.jsp
    @RequestMapping("/knowledge")
    public String knowledge(){
        return "detail/knowledge.jsp";
    }
    @RequestMapping("/knowledge1")
    public String knowledge1(){
        return "detail/knowledge1.jsp";
    }
    @RequestMapping("/knowledge2")
    public String knowledge2(){
        return "detail/knowledge2.jsp";
    }
    //显示messages.jsp
    @RequestMapping("/messages")
    public String messages(){
        return "detail/messages.jsp";
    }
    //显示personal.jsp
    @RequestMapping("/personal")
    public String personal(){
        return "detail/personal.jsp";
    }
    //显示realTimeData.jsp
    @RequestMapping("/realTimeData")
    public String realTimeData(){
        return "detail/realTimeData.jsp";
    }
    //显示screenData.jsp
    @RequestMapping("/screenData")
    public String screenData(){
        return "detail/screenData.jsp";
    }

}
