package com.springrest.controller;

import com.springrest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("Ahmed", "Elsheikh"));
        students.add(new Student("Sayed", "Ali"));
        students.add(new Student("Kamal", "Nader"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return students;
    }
}
