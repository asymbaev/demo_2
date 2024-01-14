package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JUNE, 5)

            );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JUNE, 5)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );

        };
    }
}
