package cn.hellochaos.generator.mapper

import cn.hellochaos.generator.entity.Student
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;


    /**
     * 创建初始数据
     */
    @Test
    public void testInsertStudent() {
        for (int i = 1; i < 1000; i ++) {
            Student student = new Student();
                student.setName("学生 " + i);
                student.setDescription("学生 " + i + " 的自我介绍 " + i);
            studentMapper.insert(student);
            System.out.println("已插入学生 = " +student.getStudentId());
        }
}
}
