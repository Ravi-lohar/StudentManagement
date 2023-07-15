package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Address;
import com.example.StudentManagement.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo ;
    public String addAddress(Address address) {
    addressRepo.save(address);
    return "Address Added Successfully" ;
    }

    public String UpdateAddress(Address address) {
        Optional<Address> existingAddress  = addressRepo.findById(address.getAddressId());
        if(existingAddress.isPresent()){
            Address address1 = existingAddress.get();
            address1.setDistrict(address.getDistrict());
            address1.setState(address.getState());
            address1.setZipcode(address.getZipcode());
            address1.setCountry(address.getZipcode());
            address1.setLandmark(address.getLandmark());
            addressRepo.save(address1) ;
                return "Address Updated Successfully";
            }
            else {
                return "id Not found" ;
            }
    }

    public String deleteAddress(Long id) {
        addressRepo.deleteById(id);
        return "Address Deleted Successfully" ;
    }
}
