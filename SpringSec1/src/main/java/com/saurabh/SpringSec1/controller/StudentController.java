package com.saurabh.SpringSec1.controller;

import com.saurabh.SpringSec1.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Saurabh", "Java"),
            new Student(2, "Mohit", "React"),
            new Student(3, " Abhinav",  "HTML"),
            new Student(4, "Piyush" , "Azure")
    ));

    @GetMapping("students")
    public List<Student> getStudent(){
        return  students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }

    @GetMapping("token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
