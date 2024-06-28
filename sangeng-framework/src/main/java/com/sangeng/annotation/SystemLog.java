package com.sangeng.annotation;

import org.aspectj.lang.annotation.Around;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: SystemLog
 * Package: com.sangeng.annotation
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/6/29 2:05
 */
/**/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface SystemLog {
    String businessName();
}
