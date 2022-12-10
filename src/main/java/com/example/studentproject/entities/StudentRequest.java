package com.example.studentproject.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {

    private Long id;
    public String firstName;
    private String lastName;
    private String email;
//    private StudentRequest studentRequest;
}