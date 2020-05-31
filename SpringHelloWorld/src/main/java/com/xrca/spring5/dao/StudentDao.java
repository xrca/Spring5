package com.xrca.spring5.dao;

import com.xrca.spring5.entity.Student;

/**
 * @author xrca
 * @date 2020-05-31 15:20
 */
public interface StudentDao {
    /**
     * 添加学生
     * @param student
     * @return
     */
    int addStudent(Student student);
}
