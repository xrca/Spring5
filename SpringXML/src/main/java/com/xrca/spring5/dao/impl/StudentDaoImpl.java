package com.xrca.spring5.dao.impl;

import com.xrca.spring5.dao.StudentDao;
import com.xrca.spring5.entity.Student;

/**
 * @author xrca
 * @date 2020-05-31 15:22
 */
public class StudentDaoImpl implements StudentDao {

    /**
     * 添加学生
     * @param student
     * @return
     */
    @Override
    public int addStudent(Student student) {
        System.out.println("add student...");
        return 1;
    }
}
