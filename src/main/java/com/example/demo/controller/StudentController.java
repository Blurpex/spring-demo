package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        3556583L,
                        "Haris Ahmad",
                        "hka5236@psu.edu",
                        21,
                        LocalDate.of(2001, Month.APRIL, 30)
                )
        );
    }

}
