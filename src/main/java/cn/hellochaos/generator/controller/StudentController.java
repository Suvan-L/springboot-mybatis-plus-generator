package cn.hellochaos.generator.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import cn.hellochaos.generator.entity.dto.ResultBean;
import cn.hellochaos.generator.service.StudentService;
import cn.hellochaos.generator.entity.Student;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


/**
 * <p>
 * 学生信息表 前端控制器
 * </p>
 *
 * @author suvan
 * @since 2022-04-04
 * @version v1.0
 */
@RestController
@RequestMapping("/generator/api/v1/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
    * 查询分页数据
    */
    @RequestMapping(method = RequestMethod.GET)
    public ResultBean<?> listByPage(@RequestParam(name = "page", defaultValue = "1") int page,
                                    @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
                                    @RequestParam(name = "factor", defaultValue = "") String factor) {
        return new ResultBean<>(studentService.listStudentsByPage(page, pageSize,factor));
    }


    /**
    * 根据id查询
    */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResultBean<?> getById(@PathVariable("id") Integer id) {
        return new ResultBean<>(studentService.getStudentById(id));
    }

    /**
    * 新增
    */
    @RequestMapping(method = RequestMethod.POST)
    public ResultBean<?> insert(@RequestBody Student student) {
        return new ResultBean<>(studentService.insertStudent(student));
    }

    /**
    * 删除
    */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResultBean<?> deleteById(@PathVariable("id") Integer id) {
        return new ResultBean<>(studentService.deleteStudentById(id));
    }

    /**
    * 修改
    */
    @RequestMapping(method = RequestMethod.PUT)
    public ResultBean<?> updateById(@RequestBody Student student) {
        return new ResultBean<>(studentService.updateStudent(student));
    }
}
