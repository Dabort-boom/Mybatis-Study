import com.dabor.dao.StudentMapper;
import com.dabor.dao.TeacherMapper;
import com.dabor.pojo.Student;
import com.dabor.pojo.Teacher;
import com.dabor.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author dabort
 * @date 2021/8/5 - 15:41
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

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        for (Student student : student2) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
