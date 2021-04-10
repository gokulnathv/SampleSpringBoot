package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfigs {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student gokul = new Student("Gokul", LocalDate.of(1995, 8, 12), "gokulnath.vadivel@gmail.com");
			Student mouli = new Student("Mouli", LocalDate.of(1998, 9, 8), "chandramouli.vadivel@gmail.com");
			studentRepository.saveAll(List.of(gokul, mouli));
		};
	}

}
