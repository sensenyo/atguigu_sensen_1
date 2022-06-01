package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/show")
    public String hello()
    {
        System.out.println("heiehie");
        return "helloaaaa";
    }
}
