package com.saurabh.SpringJDBCex.service;

import com.saurabh.SpringJDBCex.model.Student;
import com.saurabh.SpringJDBCex.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s){
        repo.save(s);
        System.out.println("Add Student");
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }
}
