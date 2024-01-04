package com.example.student.Book.service;

import com.example.student.Book.Student;
import com.example.student.Book.StudentJpaRepo;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Student> allStudents() {
    return studentJpaRepo.findAll();
    }

   public void deleteUser(String email){
        studentJpaRepo.deleteUser(email);
    }
}
