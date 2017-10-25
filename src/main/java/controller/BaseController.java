package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 基类
 * Created by  Yu  by  2017/9/20
 */
public abstract class BaseController {

    private final static Logger _log = LoggerFactory.getLogger(BaseController.class);

    /**
     * 统一异常处理
     *
     */
    @ExceptionHandler
    public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        _log.error("统一异常处理：", exception);
        request.setAttribute("ex", exception);
        return "error.jsp";
    }
}



