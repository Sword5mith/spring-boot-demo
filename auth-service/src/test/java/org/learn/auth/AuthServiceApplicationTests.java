package org.learn.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.learn.auth.entity.Student;
import org.learn.auth.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthServiceApplicationTests {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void contextLoads() {
        List<Student> list = studentMapper.selectList(null);
        list.forEach(System.out::println);
        list = studentMapper.selectAll();
        list.forEach(System.out::println);
    }

}
