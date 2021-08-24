package com.dabor.dao;

import com.dabor.pojo.User;
import com.dabor.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dabort
 * @date 2021/8/2 - 16:22
 */
public class UserDaoTest {

    @Test
    public void getUserList(){
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步：执行SQL
        // 方式一：getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(3);
        System.out.println(user);

        sqlSession.close();

    }@Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("李");
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();

    }
    @Test
    public void getUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("id",1);
        User user = mapper.getUserById2(map);
        System.out.println(user);

        sqlSession.close();

    }

    //增删改需要提交事务
    @Test
    public void insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int user = mapper.addUser(new User(4, "赵六", "123123"));
        System.out.println(user);

        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void update(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int user = mapper.updateUser(new User(1, "刘一", "123456"));
        System.out.println(user);

        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int user = mapper.deleteUser(4);
        System.out.println(user);

        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("userid",5);

        map.put("password","123456");

        mapper.addUser2(map);

        sqlSession.commit();
        sqlSession.close();
    }

}
