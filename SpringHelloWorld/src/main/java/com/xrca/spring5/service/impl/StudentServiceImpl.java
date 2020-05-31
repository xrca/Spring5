package com.xrca.spring5.service.impl;

import com.xrca.spring5.dao.StudentDao;
import com.xrca.spring5.entity.Student;
import com.xrca.spring5.service.StudentService;

/**
 * @author xrca
 * @date 2020-05-31 15:27
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    /**
     * 添加学生
     */
    public void addStudent() {
        Student student = new Student();
        studentDao.addStudent(student);
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
