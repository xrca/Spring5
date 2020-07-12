package com.xrca.spring5.beanLife;

import lombok.Data;

/**
 * @author xrca
 * @description 演示bean生命周期
 * @date 2020-07-12 22:13
 */
@Data
public class BeanLife {
    private String bName;

    public BeanLife() {
        System.out.println("step1：创建Bean...");
    }

    public void setbName(String bName) {
        System.out.println("step2：设置Bean属性...");
        this.bName = bName;
    }

    public void init() {
        System.out.println("step3：初始化bean...");
    }

    public void destroy() {
        System.out.println("step5：销毁bean...");
    }
}
