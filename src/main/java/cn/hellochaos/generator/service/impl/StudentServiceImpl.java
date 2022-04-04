package cn.hellochaos.generator.service.impl;

import cn.hellochaos.generator.entity.Student;
import cn.hellochaos.generator.mapper.StudentMapper;
import cn.hellochaos.generator.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import cn.hellochaos.generator.exception.bizException.BizException;

/**
* <p>
* 学生信息表 服务实现类
* </p>
*
* @author suvan
* @since 2022-04-04
*/
@Slf4j
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    public Page<Student> listStudentsByPage(int page, int pageSize, String factor) {
        log.info("正在执行分页查询student: page = {} pageSize = {} factor = {}",page,pageSize,factor);
        QueryWrapper<Student> queryWrapper =  new QueryWrapper<Student>().like("", factor);
        //TODO 这里需要自定义用于匹配的字段,并把wrapper传入下面的page方法
        Page<Student> result = super.page(new Page<>(page, pageSize));
        log.info("分页查询student完毕: 结果数 = {} ",result.getRecords().size());
        return result;
    }

    @Override
    public Student getStudentById(int id) {
        log.info("正在查询student中id为{}的数据",id);
        Student student = super.getById(id);
        log.info("查询id为{}的student{}",id,(null == student?"无结果":"成功"));
        return student;
    }

    @Override
    public int insertStudent(Student student) {
        log.info("正在插入student");
        if (super.save(student)) {
            log.info("插入student成功,id为{}",student.getStudentId());
            return student.getStudentId();
        } else {
            log.error("插入student失败");
            throw new BizException("添加失败");
        }
    }

    @Override
    public int deleteStudentById(int id) {
        log.info("正在删除id为{}的student",id);
        if (super.removeById(id)) {
            log.info("删除id为{}的student成功",id);
            return id;
        } else {
            log.error("删除id为{}的student失败",id);
            throw new BizException("删除失败[id=" + id + "]");
        }
    }

    @Override
    public int updateStudent(Student student) {
        log.info("正在更新id为{}的student",student.getStudentId());
        if (super.updateById(student)) {
            log.info("更新d为{}的student成功",student.getStudentId());
            return student.getStudentId();
        } else {
            log.error("更新id为{}的student失败",student.getStudentId());
            throw new BizException("更新失败[id=" + student.getStudentId() + "]");
        }
    }

}
