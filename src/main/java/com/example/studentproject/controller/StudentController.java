package com.example.studentproject.controller;

import com.example.studentproject.entities.StudentRequest;
import com.example.studentproject.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

//    private StudentService studentService;
     ArrayList<StudentRequest> students = new ArrayList<>();

    public StudentController(StudentService studentService) {
        super();
//        this.studentService = studentService;
    }

    @PostMapping("/add_student")
    public void studentRequest(@RequestBody StudentRequest studentRequest)
    {
        System.out.println("This is a Student Request Body name");
        students.add(studentRequest);
//        studentService.addStudent(studentRequest);
    }

    @GetMapping("/students")
    public ArrayList<StudentRequest> getAllStudents()
    {
        System.out.println("Get All students");
//        return studentService.getAllStudents();
        return students;
    }
}
