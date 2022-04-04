package cn.hellochaos.generator.service;

import cn.hellochaos.generator.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* <p>
* 学生信息表 服务类
* </p>
*
* @author suvan
* @since 2022-04-04
*/
public interface StudentService {

    /**
    * 分页查询Student
    *
    * @param page     当前页数
    * @param pageSize 页的大小
    * @param factor  搜索关键词
    * @return 返回mybatis-plus的Page对象,其中records字段为符合条件的查询结果
    * @author suvan
    * @since 2022-04-04
    */
    Page<Student> listStudentsByPage(int page, int pageSize, String factor);

    /**
    * 根据id查询Student
    *
    * @param id 需要查询的Student的id
    * @return 返回对应id的Student对象
    * @author suvan
    * @since 2022-04-04
    */
    Student getStudentById(int id);

    /**
    * 插入Student
    *
    * @param student 需要插入的Student对象
    * @return 返回插入成功之后Student对象的id
    * @author suvan
    * @since 2022-04-04
    */
    int insertStudent(Student student);

    /**
    * 根据id删除Student
    *
    * @param id 需要删除的Student对象的id
    * @return 返回被删除的Student对象的id
    * @author suvan
    * @since 2022-04-04
    */
    int deleteStudentById(int id);

    /**
    * 根据id更新Student
    *
    * @param student 需要更新的Student对象
    * @return 返回被更新的Student对象的id
    * @author suvan
    * @since 2022-04-04
    */
    int updateStudent(Student student);

}
