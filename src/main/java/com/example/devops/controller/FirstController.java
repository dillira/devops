package com.example.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class FirstController {

    @GetMapping("/greetings")
    public String sayHello1(){
        return "Hello World";
    }
    @GetMapping("/greeting1")
    public String sayHello(){
        return "Hello World2";
    }

    @GetMapping("/greeting3")
    public String sayHello2(){
        return "Hello World3";
    }
    @GetMapping("/greeting4")
    public String sayHello4(){
        return "Hello World4!";
    }
}
