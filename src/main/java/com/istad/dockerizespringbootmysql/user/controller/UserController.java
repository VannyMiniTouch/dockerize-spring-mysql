package com.istad.dockerizespringbootmysql.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/test")
    public String printTest(){
        return "TESTING...";
    }
}
