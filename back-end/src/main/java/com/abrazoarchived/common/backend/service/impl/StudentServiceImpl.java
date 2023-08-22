package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String saveStudent(StudentDTO studentDTO) {
        System.out.println(studentDTO.toString());
        return studentDTO.getFullName();
    }
}
