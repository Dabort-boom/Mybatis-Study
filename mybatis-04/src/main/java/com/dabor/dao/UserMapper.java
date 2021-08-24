package com.dabor.dao;

import com.dabor.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author dabort
 * @date 2021/8/2 - 15:55
 */
public interface UserMapper {

    //根据id查询用户
    User getUserById(int id);

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);


}
