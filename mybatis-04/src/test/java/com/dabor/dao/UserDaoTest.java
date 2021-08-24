package com.dabor.dao;

import com.dabor.pojo.User;
import com.dabor.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;


/**
 * @author dabort
 * @date 2021/8/2 - 16:22
 */
public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("StartIndex",0);
        map.put("pageSize",3);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

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

    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

}
