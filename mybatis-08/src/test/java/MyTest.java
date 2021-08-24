import com.dabor.dao.BlogMapper;
import com.dabor.pojo.Blog;
import com.dabor.utils.IdUtils;
import com.dabor.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author dabort
 * @date 2021/8/6 - 11:44
 */
public class MyTest {

    @Test

        public void addBlogTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
        }

        @Test
    public void queryBligIf(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap map = new HashMap();

            map.put("title","Mybatis如此简单啊");
            map.put("author","狂神说");
//            map.put("views",9999);
            map.put("id","666f9529d86c4d14acdd9e5e7b880791");
            mapper.updateBlog(map);

            sqlSession.commit();
            sqlSession.close();
        }


    }

