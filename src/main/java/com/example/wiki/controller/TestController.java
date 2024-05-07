package com.example.wiki.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
