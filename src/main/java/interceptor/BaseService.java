package interceptor;

import java.lang.annotation.*;

/**
 * 用于初始化BaseService的Service
 * Created by  Yu  on  2017/9/24.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {
}
