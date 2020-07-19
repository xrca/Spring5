package com.xrca.spring5.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author xrca
 * @date 2020-05-26 23:12
 */
@Data
public class Student {
    private String[] courses;

    private List<String> list;

    private Map<String, Double> map;

    private Set<String> sets;

    private List<Course> myCourses;

    public Student() {
        System.out.println("init......");
    }

    public void say() {
        System.out.println("hello~");
    }
}
