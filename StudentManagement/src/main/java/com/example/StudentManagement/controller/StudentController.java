package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.Student;
import com.example.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService ;
    @PostMapping("Student")
    public String addStudent( @RequestBody  Student student ){
        return studentService.addStudent(student);
    }


    @GetMapping("Students")
    public Iterable<Student> getStudents(){
        return studentService.getStudents();
    }



}
