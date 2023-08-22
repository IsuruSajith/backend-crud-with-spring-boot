package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void saveStudent(StudentDTO studentDTO) {
        System.out.println(studentDTO.toString());
    }
}
