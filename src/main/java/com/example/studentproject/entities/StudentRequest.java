package com.example.studentproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class StudentRequest {

    private Long id;
    public String firstName;
    private String lastName;
    private String email;
}