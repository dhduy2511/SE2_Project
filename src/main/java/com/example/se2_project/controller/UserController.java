package com.example.se2_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/user")
    public String user(){
        return "user";
    }
}
