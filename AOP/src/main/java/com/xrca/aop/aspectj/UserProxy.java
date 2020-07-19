package com.xrca.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author xrca
 * @description 增强类
 * @date 2020-07-19 21:59
 */
@Component
@Aspect // 生成代理对象
public class UserProxy {

    // 前置通知
    // @Before注解表示作为前置通知
    @Before(value = "execution(* com.xrca.aop.aspectj.User.say(..))")
    public void before() {
        System.out.println("before...");
    }
}
