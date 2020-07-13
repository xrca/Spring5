package com.xrca.spring5.factoryBean;

import com.xrca.spring5.entity.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author xrca
 * @description 自定义factoryBean
 * @date 2020-07-12 21:26
 */
public class XRCAFactoryBean implements FactoryBean<Course> {

    // 定义返回Bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("Java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
