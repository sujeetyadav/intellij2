package com.example.demo.controller;

import com.example.demo.service.HelloSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloSerivce helloSerivce;

    @GetMapping("/greet")
    String greeting(){
        return helloSerivce.greet();
    }
}
