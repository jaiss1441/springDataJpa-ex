package com.example.springDataJpa_ex.repo;

import com.example.springDataJpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {


    List<Student> findBysname(String name);
}
