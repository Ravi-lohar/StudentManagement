package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.Laptop;
import com.example.StudentManagement.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService ;

    @PostMapping("Laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return  laptopService.addLaptop(laptop) ;
    }
}
