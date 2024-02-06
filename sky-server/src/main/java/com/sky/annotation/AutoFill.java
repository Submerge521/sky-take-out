package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: AutoFill
 * Package: com.sky.annotation
 * Description: 自定义注解--自动填充公共字段
 *
 * @Author Submerge--WangDong
 * @Create 2024-02-06 20:21
 * @Version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {

    // 数据库操作类型 update insert
    OperationType value();

}
