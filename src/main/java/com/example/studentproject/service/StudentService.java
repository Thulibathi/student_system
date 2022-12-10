package com.example.studentproject.service;

import com.example.studentproject.entities.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements Student{

    private List<StudentRequest> studentResponseList;
    public StudentService() {
        super();
        this.studentResponseList = new ArrayList<>();
    }

//    @Override
//    public List<StudentRequest> addStudent(StudentRequest studentRequest) {
//        studentResponseList.add(studentRequest);
//        return studentResponseList;
//    }

    @Override
    public StudentRequest updateStudent(StudentRequest studentRequest) {
        return null;
    }

    @Override
    public StudentRequest getStudent(int studentNumber) {
        return null;
    }

    @Override
    public List<StudentRequest> getAllStudents() {

        return null;
    }

    @Override
    public void deleteStudent(StudentRequest studentRequest) {

    }
}
