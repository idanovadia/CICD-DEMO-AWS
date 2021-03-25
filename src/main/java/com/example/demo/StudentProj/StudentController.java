package com.example.demo.StudentProj;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController
{
    List<Student> students = new ArrayList<>();

    @GetMapping("/student")
    private List<Student> getAllStudent()
    {
        return students;
    }

    @PostMapping("/student")
    private Student saveStudent(@RequestBody Student student)
    {
        students.add(student);
        return student;
    }
}
