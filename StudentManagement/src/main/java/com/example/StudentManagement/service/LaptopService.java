package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Laptop;
import com.example.StudentManagement.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo ;
    public String addLaptop(Laptop laptop) {
    laptopRepo.save((laptop) );
    return "Laptop Added Successfully" ;
    }
}
