package com.example.springDataJpa_ex.comtroller;

import com.example.springDataJpa_ex.dto.StudentDto;
import com.example.springDataJpa_ex.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public String saveStudent(@RequestBody StudentDto studentDto) {
        return studentService.addStudent(studentDto);
    }

    @GetMapping("/student{id}")
    public String findStudent() {
        return studentService.findStudent();
    }

    @PutMapping("/student{id}")
    public String updateStudent(){
        return studentService.updateStudent();
    }
}
