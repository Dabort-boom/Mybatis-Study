package com.dabor.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author dabort
 * @date 2021/8/5 - 15:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    private int id;
    private String name;
    //一个老师拥有多名学生
    private List<Student> students;


}
