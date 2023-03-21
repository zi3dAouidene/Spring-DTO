package com.example.springdto.service;

import com.example.springdto.model.Student;
import com.example.springdto.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

}
