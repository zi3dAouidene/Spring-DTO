package com.example.springdto.controller;

import com.example.springdto.model.Student;
import com.example.springdto.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public List<Student> getAllStudents(){
        System.out.println("getAllStudents() invoked !!!");
        return studentService.getStudents();
    }
}
