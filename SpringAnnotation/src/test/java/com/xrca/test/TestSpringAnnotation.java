package com.xrca.test;

import com.xrca.spring5.autowrie.Computer;
import com.xrca.spring5.bean.*;
import com.xrca.spring5.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xrca
 * @description 测试用例
 * @date 2020-07-13 22:00
 */
public class TestSpringAnnotation {

    /**
     * 测试注解方式管理Bean
     */
    @Test
    public void testComponent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CPU cpu = applicationContext.getBean("CPU", CPU.class);
        System.out.println(cpu);

        GPU gpu = applicationContext.getBean("GPU", GPU.class);
        System.out.println(gpu);

        Keyborad keyborad = applicationContext.getBean("keyborad", Keyborad.class);
        System.out.println(keyborad);

        Mouse mouse = applicationContext.getBean("mouse", Mouse.class);
        System.out.println(mouse);

        BIOS bios = applicationContext.getBean("bios", BIOS.class);
        System.out.println(bios);
    }

    /**
     * 测试注解方式注入属性
     */
    @Test
    public void testAutowrie() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Computer computer = applicationContext.getBean("computer", Computer.class);
        System.out.println(computer.getName() + "：" + computer.getCpu() + " - " + computer.getGpu() + " - "
                + computer.getKeyborad() + " - " + computer.getBios());
    }

    /**
     * 测试完全注解开发
     */
    @Test
    public void testConfig() {
        // 加载配置类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = applicationContext.getBean("computer", Computer.class);
        System.out.println(computer.getName() + "：" + computer.getCpu() + " - " + computer.getGpu() + " - "
                + computer.getKeyborad() + " - " + computer.getBios());
    }
}
