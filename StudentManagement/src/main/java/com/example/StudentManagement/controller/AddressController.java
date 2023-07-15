package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.Address;

import com.example.StudentManagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService ;

    @PostMapping("Address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @PutMapping("update/Address")
    public String UpdateAddress(@RequestBody Address address){
        return addressService.UpdateAddress(address);
    }

    @DeleteMapping("delete/ {id}")
    public String deleteAddress(@PathVariable Long id ){
        return addressService.deleteAddress(id);
    }
}
