package com.example.student.Book.service;

import com.example.student.Book.Student;
import com.example.student.Book.StudentJpaRepo;
import org.springframework.stereotype.Service;

@Service
public class ApiService {


    StudentJpaRepo studentJpaRepo;
    public ApiService(StudentJpaRepo studentJpaRepo){
        this.studentJpaRepo = studentJpaRepo;
    }

    public void insertStudent(Student student) {
        studentJpaRepo.save(student);
    }

    public Student findUserByEmail(String email) {
        return studentJpaRepo.findStudentByEmail(email);
    }
}
