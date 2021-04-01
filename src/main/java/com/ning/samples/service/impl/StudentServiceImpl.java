package com.ning.samples.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ning.samples.entity.Student;
import com.ning.samples.mapper.StudentMapper;
import com.ning.samples.service.StudentService;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
