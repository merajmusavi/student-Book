package com.example.student.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentBookApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentJpaRepo studentJpaRepo){


		return args -> {
		};
	}
}
