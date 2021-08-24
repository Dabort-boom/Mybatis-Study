package com.dabor.dao;

import com.dabor.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author dabort
 * @date 2021/8/5 - 15:32
 */
public interface TeacherMapper {

    @Select("select * from teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid") int id);

}
