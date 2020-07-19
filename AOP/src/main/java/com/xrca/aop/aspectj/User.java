package com.xrca.aop.aspectj;

import org.springframework.stereotype.Component;

/**
 * @author xrca
 * @description 被增强类
 * @date 2020-07-19 21:58
 */
@Component
public class User {

    public void say() {
        System.out.println("hello...");
    }
}
