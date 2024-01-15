package com.security.demo.anotation.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        return "hello from controller";
    }
}
