package com.example.demostudent.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="names", nullable = false)
    private String name;
    private String roll;
    private String address;
}
