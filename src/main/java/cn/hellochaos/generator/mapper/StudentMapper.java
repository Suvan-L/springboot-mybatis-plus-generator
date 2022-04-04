package cn.hellochaos.generator.mapper;

import cn.hellochaos.generator.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
* <p>
* 学生信息表 Mapper 接口
* </p>
*
* @author suvan
* @since 2022-04-04
*/
@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {

}
