package com.example.student.Book;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StudentJpaRepo extends JpaRepository<Student,Long> {

    @Query("SELECT s from student s WHERE email = ?1")
    Student findStudentByEmail(String email);

    @Transactional
    @Modifying
    @Query("DELETE FROM student s where s.email = ?1")
    void deleteUser(String email);
}
