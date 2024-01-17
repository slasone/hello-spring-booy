package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
    @GetMapping("/")
    public String index(){
        return "Hello Springboot";
    }


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello, %s!", name);
    }

    
    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return String.format("Hello, %s!", name);
    }
}
