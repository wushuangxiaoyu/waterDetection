package interceptor;


import entity.WaterUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录验证拦截器
 * Created by  Yu  on  2017/9/23.
 */
public class LoginInterceptor implements HandlerInterceptor {

    private static final String[] IGNORE_URI={"/","/user/login"};

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag=false;
        String servletPath=request.getServletPath();
        //System.out.println(servletPath);
        for (String s:IGNORE_URI) {
            if(servletPath.equals(s)){
                flag=true;
                break;
            }
        }
        if(!flag){
            WaterUser user= (WaterUser) request.getSession().getAttribute("user");
            if(user==null){
                request.getRequestDispatcher("").forward(request,response);
            }
            else
                flag=true;
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
