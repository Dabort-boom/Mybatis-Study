import com.dabor.dao.TeacherMapper;
import com.dabor.pojo.Teacher;
import com.dabor.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author dabort
 * @date 2021/8/6 - 9:14
 */
public class MyTest {

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }

}
