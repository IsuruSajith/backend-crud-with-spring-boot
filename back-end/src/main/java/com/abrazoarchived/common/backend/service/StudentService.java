package com.abrazoarchived.common.backend.service;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.dto.request.StudentUpdateDTO;

public interface StudentService {
    public String saveStudent(StudentDTO studentDTO);

    String updateStudent(StudentUpdateDTO studentUpdateDTO);
}
