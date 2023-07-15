package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Course;
import com.example.StudentManagement.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo ;
    public String addCourse(Course course) {
    courseRepo.save(course);
    return  "Course Added Successfully " ;
    }
}
