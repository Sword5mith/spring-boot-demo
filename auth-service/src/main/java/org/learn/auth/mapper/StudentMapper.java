package org.learn.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.learn.auth.entity.Student;

import java.util.List;

/**
 * @author tanjie
 * @since 2019/04/04
 */
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> selectAll();
}
