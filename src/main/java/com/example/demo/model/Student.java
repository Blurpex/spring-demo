package com.example.demo.model;

import java.time.LocalDate;

public class Student {

    // attributes
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dob;

    // constructor
    public Student(Long id, String name, String email, Integer age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    // getter methods
    public Long getId()         { return id; }
    public String getName()     { return name; }
    public String getEmail()    { return email; }
    public Integer getAge()     { return age; }
    public LocalDate getDob()   { return dob; }

    // setter methods
    public void setId(Long id)          { this.id = id; }
    public void setName(String name)    { this.name = name; }
    public void setEmail(String email)  { this.email = email; }
    public void setAge(Integer age)     { this.age = age; }
    public void setDob(LocalDate dob)   { this.dob = dob; }

}
