package com.example.studentproject.controller;

import com.example.studentproject.entities.StudentRequest;
import com.example.studentproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

     @Autowired
     StudentService studentService;
    @PostMapping("/add_student")
    public void addStudent(@RequestBody StudentRequest studentRequest)
    {
        System.out.println("This is a Student Request Body name");
        studentService.addStudent(studentRequest);
    }

    @GetMapping("/students")
    public ArrayList<StudentRequest> getAllStudents()
    {
        System.out.println("Get All students");
        return studentService.getAllStudents();
    }

    @PatchMapping("/students")
    public StudentRequest updateStudent(StudentRequest studentRequest)
    {
        System.out.println("Student details update");
        return studentService.updateStudent(studentRequest);
    }
    
    @GetMapping("/students/{id}")
    public void deleteStudent(Long studentNumber) {
        studentService.deleteStudent(studentNumber);
    }
}
