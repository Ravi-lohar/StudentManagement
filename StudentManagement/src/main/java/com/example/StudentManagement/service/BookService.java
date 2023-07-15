package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Book;
import com.example.StudentManagement.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo ;
    public String addBook(Book book) {
        bookRepo.save(book) ;
        return "Book Added Successfully" ;
    }
}
