package com.dabor.dao;

import com.dabor.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author dabort
 * @date 2021/8/9 - 15:24
 */
public interface UserMapper {

    User queryUserById(@Param("id") int id);

}
