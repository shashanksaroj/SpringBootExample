package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Component
public class StudentService {



    private final StudentRespository studentRespository;

    @Autowired
    public StudentService(StudentRespository studentRespository) {
        this.studentRespository = studentRespository;
    }

    public List<Student> getStudents(){
        return studentRespository.findAll();

    }


    public void addnewStudent(Student student) {

        studentRespository.save(student);
    }

    public void deleteStudent(Long studentId) {
    }
}
