package com.example.student.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepo extends JpaRepository<Student,Long> {
}
