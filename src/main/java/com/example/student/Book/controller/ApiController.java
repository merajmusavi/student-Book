package com.example.student.Book.controller;


import com.example.student.Book.Student;
import com.example.student.Book.service.ApiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    ApiService apiService;

    public ApiController(ApiService apiService){
        this.apiService = apiService;
    }



    @PostMapping("addStudent")
    void insertStu(@RequestBody Student student){
        apiService.insertStudent(student);

    }

}
