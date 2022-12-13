package com.example.studentproject.repository;


import com.example.studentproject.entities.StudentRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentRequest,Long>{

}
