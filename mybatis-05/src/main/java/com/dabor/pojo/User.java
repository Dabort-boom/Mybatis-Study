package com.dabor.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dabort
 * @date 2021/8/2 - 15:52
 */
//实体类
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String password;


}
