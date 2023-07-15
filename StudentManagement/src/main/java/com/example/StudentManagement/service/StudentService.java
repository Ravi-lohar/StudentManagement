package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Student;
import com.example.StudentManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo ;
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student Added Successfully";
    }

    public Iterable<Student> getStudents() {
        return studentRepo.findAll() ;
    }
}
