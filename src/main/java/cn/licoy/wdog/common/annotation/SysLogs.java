package cn.licoy.wdog.common.annotation;

import java.lang.annotation.*;

/**
 * @author mjy
 * @version 2018/4/27/17:36
 * 系统日志
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogs {

    String value();

}
