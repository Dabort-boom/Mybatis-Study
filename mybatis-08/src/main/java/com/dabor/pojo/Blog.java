package com.dabor.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author dabort
 * @date 2021/8/6 - 11:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}
