package com.abrazoarchived.common.backend.service;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.dto.request.StudentUpdateDTO;

import java.util.List;

public interface StudentService {
    public String saveStudent(StudentDTO studentDTO);

    String updateStudent(StudentUpdateDTO studentUpdateDTO);

    StudentDTO getStudentById(String studentNic);

    List<StudentDTO> getAllStudents();

    String deleteById(String studentNic);

    List<StudentDTO> getStudentByStatus(boolean status);
}
