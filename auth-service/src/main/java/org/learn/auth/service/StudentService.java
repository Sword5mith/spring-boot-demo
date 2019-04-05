package org.learn.auth.service;

import org.learn.auth.entity.Student;
import org.learn.auth.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanjie
 * @since 2019/04/05
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getAll() {
        return studentMapper.selectList(null);
    }
}
