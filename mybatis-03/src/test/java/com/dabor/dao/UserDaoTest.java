package com.dabor.dao;

import com.dabor.pojo.User;
import com.dabor.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author dabort
 * @date 2021/8/2 - 16:22
 */
public class UserDaoTest {

    @Test
    public void getUserList() {
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步：执行SQL
        // 方式一：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(5);
        System.out.println(user);
        //关闭sqlSession
        sqlSession.close();
    }
}
