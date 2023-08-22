package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.repository.StudentRepository;
import com.abrazoarchived.common.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public String saveStudent(StudentDTO studentDTO) {



        return studentDTO.getFullName();
    }
}
