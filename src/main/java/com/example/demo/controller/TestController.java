package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class TestController {


    @GetMapping("/deneme")
    public String getDeneme(){
        return "deneme";
    }



}
