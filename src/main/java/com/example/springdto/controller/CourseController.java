package com.example.springdto.controller;

import com.example.springdto.model.Course;
import com.example.springdto.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @RequestMapping("/alls")
    public List<Course> getAllCourses(){
        System.out.println("getAllCourses() invoked !!! ");
        return courseService.getCourses();
    }

}
