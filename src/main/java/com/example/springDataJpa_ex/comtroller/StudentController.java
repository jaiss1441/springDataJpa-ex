package com.example.springDataJpa_ex.comtroller;

import com.example.springDataJpa_ex.dto.StudentDto;
import com.example.springDataJpa_ex.model.Student;
import com.example.springDataJpa_ex.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public String saveStudent(@RequestBody StudentDto studentDto) {
        return studentService.addStudent(studentDto);
    }


    @GetMapping("/student")
    public List<Student> viewAllStudent(){
        return studentService.viewAllStudent();
    }
    @GetMapping("/student/id/{id}")
    public Optional<Student> findStudent(@PathVariable int id) {
        return studentService.findStudent(id);
    }

    @GetMapping("/student/name/{name}")
    public List<Student> findBySName(@PathVariable("name") String name){
        return studentService.findBySName(name);
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable int id ,@RequestBody StudentDto studentDto ){
        return studentService.updateStudent(id,studentDto);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id){
       studentService.deleteStudent(id);
    }
}
