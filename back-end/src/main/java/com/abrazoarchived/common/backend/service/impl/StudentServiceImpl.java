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
import java.util.List;

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

    @Override
    public StudentDTO getStudentById(String studentNic) {
        if (studentRepository.existsById(studentNic)) {
            Student student = studentRepository.getReferenceById(studentNic);
            StudentDTO studentDTO = new StudentDTO(student.getNic(), student.getFullName(), student.getAddress(), student.getAdmissionNo(),

                    student.getAddmissionDate(), student.getCourses(), student.getFaculty(), student.getContactNumbers(), student.isActiveStatus());
            return studentDTO;
        } else {
            throw new RuntimeException("not found");
        }
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        ArrayList<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            StudentDTO studentDTO = new StudentDTO(student.getNic(), student.getFullName(), student.getAddress(), student.getAdmissionNo(),

                    student.getAddmissionDate(), student.getCourses(), student.getFaculty(), student.getContactNumbers(), student.isActiveStatus());
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }

    @Override
    public String deleteById(String studentNic) {
        if (studentRepository.existsById(studentNic)) {

            studentRepository.deleteById(studentNic);
            return studentNic+" is deleted successfully";
        } else {
            throw new RuntimeException("not found for delete");
        }
    }
}
