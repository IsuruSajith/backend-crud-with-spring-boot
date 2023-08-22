package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentHttpController {
    @PostMapping
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.saveStudent(studentDTO);
        return studentDTO;
    }
}
