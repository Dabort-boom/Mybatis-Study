package com.dabor.dao;

import com.dabor.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author dabort
 * @date 2021/8/6 - 11:09
 */
public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBligIf(Map map);

    List<Blog> queryBligChoose(Map map);

    //更新博客
    int updateBlog(Map map);

}
