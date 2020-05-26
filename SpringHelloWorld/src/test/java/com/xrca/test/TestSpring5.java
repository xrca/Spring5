package com.xrca.test;

import com.xrca.spring5.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xrca
 * @date 2020-05-26 23:30
 */
public class TestSpring5 {

    /**
     * 测试spring获取bean
     */
    @Test
    public void testStu() {
        String[] paths = System.getProperty("java.class.path").split(";");
        for (String path : paths) {
            System.out.println(path);
        }
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student xiaoMing = applicationContext.getBean("stu", Student.class);
        if (xiaoMing != null) {
            xiaoMing.say();
        }
    }
}
