package com.example.studentproject.service;

import com.example.studentproject.entities.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface Student {
    StudentRequest addStudent(StudentRequest studentRequest);

    StudentRequest updateStudent(StudentRequest studentRequest);

    StudentRequest getStudent(Long studentNumber);

    ArrayList<StudentRequest> getAllStudents();

    void deleteStudent(Long studentNumber);
}
