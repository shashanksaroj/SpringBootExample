package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static javax.xml.datatype.DatatypeConstants.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRespository respository){

   return args -> {

       Student ram = new Student(

               "ram",
               "ram@xyz.com",
               LocalDate.of(2000, JANUARY, 03),
               22
       );

       Student alex = new Student(

               "alex",
               "ram@xyz.com",
               LocalDate.of(2000, JANUARY, 03),
               22
       );

       respository.saveAll(List.of(ram,alex));

   };



    }
}
