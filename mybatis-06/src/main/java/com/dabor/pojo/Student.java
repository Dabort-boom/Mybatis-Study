package com.dabor.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dabort
 * @date 2021/8/5 - 15:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int id;
    private String name;

    //学生需要关联一个老师
    private Teacher teacher;

}
