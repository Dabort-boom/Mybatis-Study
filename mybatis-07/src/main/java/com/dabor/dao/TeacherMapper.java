package com.dabor.dao;

import com.dabor.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author dabort
 * @date 2021/8/5 - 15:32
 */
public interface TeacherMapper {

    //获取老师
    //List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(@Param("tid") int id);
}
