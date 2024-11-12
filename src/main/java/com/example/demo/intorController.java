package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class intorController {

    ArrayList<String> list = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/me")
    public  void me() {
        String name , address , phone ;
        name="Thamer";
        address="123 Main Street";
        phone="123-456-789";
        System.out.printf("My name is %s and my address %s and my phone : ",name,address,phone);
    }

    @GetMapping("/list")
    public ArrayList names() {
        return list;
    }
}
