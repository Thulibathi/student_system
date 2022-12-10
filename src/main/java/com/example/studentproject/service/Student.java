package com.example.studentproject.service;

import com.example.studentproject.entities.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Student {
//    List<StudentRequest> addStudent(StudentRequest studentRequest);

    StudentRequest updateStudent(StudentRequest studentRequest);

    StudentRequest getStudent(int studentNumber);

    List<StudentRequest> getAllStudents();

    void deleteStudent(StudentRequest studentRequest);
}
