package com.example.springDataJpa_ex.repo;

import com.example.springDataJpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {


}
