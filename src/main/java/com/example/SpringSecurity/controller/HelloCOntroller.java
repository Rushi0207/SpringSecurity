package com.example.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloCOntroller {
    @GetMapping
    public String helloController(){
        return "Hello";
    }

}
