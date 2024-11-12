package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {
    ArrayList<String> names= new ArrayList<>();



    @GetMapping("/name")
    public String name() {
        String name  ;
        name="Thamer";

       String newName = "My name is" + name  ;
        return newName;
    }

    @GetMapping("/age")
    public  String  age() {
        int age=29;
       String newAge="My age is"+ age;
    return newAge;

    }


    @GetMapping("/check")
    public  String check() {
       return  "Everything is ok";
    }

    @GetMapping("/health")
    public  String health() {
       return   "Server is healthy up and running" ;
    }

    @GetMapping("/namesList")
    public ArrayList<String> namesList(ArrayList<String> names) {

        names.add("hussam");
        names.add("John");
        names.add("Mary");
       return names;

    }



}
