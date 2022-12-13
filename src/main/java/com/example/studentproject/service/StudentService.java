package com.example.studentproject.service;

import com.example.studentproject.entities.StudentRequest;
import com.example.studentproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements Student{
    @Autowired
    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentRequest addStudent(StudentRequest studentRequest) {
        return studentRepository.save(studentRequest);
    }

    @Override
    public StudentRequest updateStudent(StudentRequest studentRequest) {

        return studentRepository.save(studentRequest);
    }

    @Override
    public StudentRequest getStudent(Long studentNumber) {

        return studentRepository.findById(studentNumber).get();
    }

    @Override
    public ArrayList<StudentRequest> getAllStudents() {

        return (ArrayList<StudentRequest>) studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long studentNumber) {
        studentRepository.deleteById(studentNumber);
    }
}
