package com.example.springDataJpa_ex.service;

import com.example.springDataJpa_ex.dto.StudentDto;
import com.example.springDataJpa_ex.model.Student;
import com.example.springDataJpa_ex.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    public String addStudent(StudentDto studentDto) {

        Student student1 = new Student();
        student1.setSname(studentDto.getSname());
        student1.setMarks(studentDto.getMarks());

        studentRepo.save(student1);
        return "Student saved successfully";
    }

    public Optional<Student> findStudent(int id) {
        return studentRepo.findById(id);
    }

//    public String updateStudent() {
//        return studentRepo.updateStudent();
//    }
}
