package interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Spring 容器初始化事件
 * Created by  Yu  on  2017/9/23.
 */
public class ApplicationContextListener implements ApplicationListener<ContextRefreshedEvent> {
    private  static Logger _log= LoggerFactory.getLogger(ApplicationContextListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //判断是否是root application context
       // if (null==event.getApplicationContext().getParent()) {
            //System.out.println(event.getApplicationContext().getClass().getName());
            _log.debug(">>>>>>>>>>>>>>>>>>Spring初始化完毕");
            //调用所有Service中initMapper()方法
            Map<String, Object> baseServices = event.getApplicationContext().getBeansWithAnnotation(BaseService.class);
            for (Object service : baseServices.values()) {
                _log.debug(">>>>>>>>>>>>>>>{}.initMapper()", service.getClass().getName());
                try {
                    Method initMapper = service.getClass().getMethod("initMapper");
                    initMapper.invoke(service);
                } catch (Exception e) {
                    _log.error("初始化Service.initMapper失败", e);
                    e.printStackTrace();
                }
            }
        //}
    }
}
