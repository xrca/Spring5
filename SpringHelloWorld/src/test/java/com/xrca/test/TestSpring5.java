package com.xrca.test;

import com.xrca.spring5.Book;
import com.xrca.spring5.Order;
import com.xrca.spring5.Student;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author xrca
 * @date 2020-05-26 23:30
 */
public class TestSpring5 {

    /**
     * 测试spring获取bean，ApplicationContext在读取配置文件时就会初始化对象
     */
    @Test
    public void testStu() {
        String[] paths = System.getProperty("java.class.path").split(";");
        for (String path : paths) {
            System.out.println(path);
        }
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        /*Student xiaoMing = applicationContext.getBean("stu", Student.class);
        if (xiaoMing != null) {
            xiaoMing.say();
        }*/
    }

    /**
     * 测试BeanFactory，BeanFactory在加载配置文件时不会初始化对象，只有在获取或者调用对象时才会进行初始化
     */
    @Test
    public void testStu2() {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        /*Student xiaoMing = beanFactory.getBean("stu", Student.class);
        if (xiaoMing != null) {
            xiaoMing.say();
        }*/
    }

    /**
     * 测试spring的XML方式注入属性
     */
    @Test
    public void testBook() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Book book = applicationContext.getBean("book", Book.class);
        if (book != null) {
            System.out.println(book.getName());
        }
    }

    /**
     * 测试spring中使用有参构造方法注入属性
     */
    @Test
    public void testOrder() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Order order = applicationContext.getBean("order2", Order.class);
        if (order != null) {
            System.out.println(order.getName() + "  " + order.getAddress());
        }
    }
}
