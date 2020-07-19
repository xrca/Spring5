package com.xrca.spring5.aop;

import com.xrca.aop.aspectj.User;
import com.xrca.aop.aspectj.UserProxy;
import com.xrca.aop.dao.UserDao;
import com.xrca.aop.dao.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author xrca
 * @date 2020-07-19 15:30
 */
public class TestAop {

    /**
     * 测试手动实现AOP功能
     */
    @Test
    public void testAop1() {
        Class[] interfaces = {UserDao.class};
        UserDao userDao = (UserDao) Proxy.newProxyInstance(TestAop.class.getClassLoader(), interfaces, (proxy, method, args) -> {
            System.out.println("before...，method：" + method.getName() + "，args：" + Arrays.toString(args));
            UserDao proxyObj = new UserDaoImpl();
            Object result = method.invoke(proxyObj, args);
            System.out.println("after...");
            return result;
        });
        System.out.println(userDao.add(1, 2));
        System.out.println(userDao.plus(2, 2));
    }

    /**
     * 测试前置通知
     */
    @Test
    public void beforeAop() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = applicationContext.getBean("user", User.class);
        user.say();
    }
}
