package com.atguigu11.annotation;


import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: MyAnnotation
 * Package: com.atguigu11.annotation
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 21:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
public @interface MyAnnotation {
    String value() default "hello";
}
