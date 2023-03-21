package com.example.springdto.service;

import com.example.springdto.model.Course;
import com.example.springdto.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getCourses(){
        return courseRepo.findAll();
    }
}
