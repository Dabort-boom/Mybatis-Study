package com.dabor.dao;

import com.dabor.pojo.Student;

import java.util.List;

/**
 * @author dabort
 * @date 2021/8/5 - 15:32
 */
public interface StudentMapper {

    //查询所有的学生信息，及对应的老师的信息
    public List<Student> getStudent();

    public List<Student> getStudent2();

}
