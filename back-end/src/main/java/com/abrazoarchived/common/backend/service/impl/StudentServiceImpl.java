package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.dto.request.StudentUpdateDTO;
import com.abrazoarchived.common.backend.entity.Student;
import com.abrazoarchived.common.backend.repository.StudentRepository;
import com.abrazoarchived.common.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String saveStudent(StudentDTO studentDTO) {
        Student student = new Student(studentDTO.getNic(), studentDTO.getFullName(), studentDTO.getAddress(), studentDTO.getAdmissionNo(), studentDTO.getAddmissionDate(), studentDTO.getCourses(), studentDTO.getFaculty(), studentDTO.getContactNumbers(), studentDTO.isActiveStatus());
        studentRepository.save(student);

        return studentDTO.getFullName();
    }

    @Override
    public String updateStudent(StudentUpdateDTO studentUpdateDTO) {

        if (studentRepository.existsById(studentUpdateDTO.getNic())) {
            Student student = studentRepository.getReferenceById(studentUpdateDTO.getNic());

            student.setFullName(studentUpdateDTO.getFullName());
            student.setAddress(studentUpdateDTO.getAddress());
            student.setCourses(studentUpdateDTO.getCourses());
            student.setContactNumbers(studentUpdateDTO.getContactNumbers());

            studentRepository.save(student);
        } else {
            throw new RuntimeException("nic not found");

        }
        return studentUpdateDTO.getNic() + " updated successfully";
    }
}
