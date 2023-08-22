package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentHttpController {

    @PostMapping
    public String saveStudent(@RequestBody StudentDTO studentDTO) {
        System.out.println(studentDTO.getFullName());
        return studentDTO.getFullName();
    }
}
