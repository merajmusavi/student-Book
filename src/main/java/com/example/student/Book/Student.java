package com.example.student.Book;

import jakarta.persistence.*;

@Entity(name = "student")
@Table(name = "student"
,uniqueConstraints = {
        @UniqueConstraint(name = "un_email",columnNames = "email")
})
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "first_name",
            columnDefinition = "TEXT"
    )
    private String firstName;
    @Column(
            name = "email"
    )
    private String email;
    @Column(
            name = "age"
    )
    private Integer age;


    public Student(String firstName, String email, Integer age) {
        this.firstName = firstName;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
