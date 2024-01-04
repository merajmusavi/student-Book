package com.example.student.Book.controller;


import com.example.student.Book.Student;
import com.example.student.Book.service.ApiService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{email}")
    Student student(@PathVariable String email){
        return apiService.findUserByEmail(email);
    }

}
