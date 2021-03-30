package com.ning.samples.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ning.samples.entity.Role;
import com.ning.samples.entity.Student;
import com.ning.samples.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JayNing
 * @since 2021-03-30
 */
@RestController
@RequestMapping("/samples/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public @ResponseBody List<Student> query(Student student){
        QueryWrapper<Student> query = Wrappers.query(student);
        return studentService.list(query);
    }

}
