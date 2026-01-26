package com.example.springDataJpa_ex.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String sname;
    private  int marks;
}
