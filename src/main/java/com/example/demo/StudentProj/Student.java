package com.example.demo.StudentProj;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;
    //defining name as column name
    private String name;
    //defining age as column name
    private int age;
    //defining email as column name
    private String email;
}
