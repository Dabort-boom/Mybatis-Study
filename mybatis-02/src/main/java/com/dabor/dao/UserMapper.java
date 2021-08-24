package com.dabor.dao;

import com.dabor.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author dabort
 * @date 2021/8/2 - 15:55
 */
public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //insert一个用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);


}
