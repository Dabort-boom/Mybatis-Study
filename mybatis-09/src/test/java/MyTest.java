import com.dabor.dao.UserMapper;
import com.dabor.pojo.User;
import com.dabor.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author dabort
 * @date 2021/8/9 - 15:31
 */
public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);

        System.out.println(user == user1);

        sqlSession1.close();
    }

}
