package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello, ho hoang khoi dep trai vcl, kkkkkk";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello, ho hoang khoi dep trai vcl, kkkkkk";
    }

}