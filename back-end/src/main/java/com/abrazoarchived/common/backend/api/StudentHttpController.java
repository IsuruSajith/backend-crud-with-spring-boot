package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.StudentDTO;
import com.abrazoarchived.common.backend.dto.request.StudentUpdateDTO;
import com.abrazoarchived.common.backend.service.SampleService;
import com.abrazoarchived.common.backend.service.StudentService;
import com.abrazoarchived.common.backend.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PatchMapping
    public String updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO) {
        String message = studentService.updateStudent(studentUpdateDTO);
        return message;
    }

    @GetMapping(
            path = "/get-by-nic",
            params = "nic"
    )
    public StudentDTO getStudentById(@RequestParam(value = "nic") String studentNic) {
        StudentDTO student = studentService.getStudentById(studentNic);
        return student;
    }

    @GetMapping(
            path = "/get-all-students"
    )
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> allStudents = studentService.getAllStudents();

        return allStudents;
    }

    @DeleteMapping(
            path = "/delete-student/{nic}"
    )
    public String deleteStudent(@PathVariable(value = "nic") String studentNic) {

        String message = studentService.deleteById(studentNic);
        return message;
    }

    @GetMapping(
            path = "/get-status/{status}"
    )
    public List<StudentDTO> getStudentWithStatus(@PathVariable("status") boolean status) {
        List<StudentDTO> studentByStatus = studentService.getStudentByStatus(status);
        return studentByStatus;
    }
}
