package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.Course;
import com.example.StudentManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService ;

    @PostMapping("Course")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
}
