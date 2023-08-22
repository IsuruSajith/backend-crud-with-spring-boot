package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.service.SampleService;
import com.abrazoarchived.common.backend.service.StudentService;
import com.abrazoarchived.common.backend.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentHttpController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO) {
        //StudentServiceImpl studentService = new StudentServiceImpl();
        //studentService.saveStudent(studentDTO);
        //System.out.println(studentService);
        System.out.println(studentService.saveStudent(studentDTO));
        return studentDTO;
    }
}
