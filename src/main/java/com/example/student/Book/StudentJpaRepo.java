package com.example.student.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentJpaRepo extends JpaRepository<Student,Long> {

    @Query("SELECT s from student s WHERE email = ?1")
    Student findStudentByEmail(String email);
}
