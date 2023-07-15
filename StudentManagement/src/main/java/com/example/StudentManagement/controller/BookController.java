package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.Book;
import com.example.StudentManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @Autowired
    BookService bookService ;

    @PostMapping("Book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
}
