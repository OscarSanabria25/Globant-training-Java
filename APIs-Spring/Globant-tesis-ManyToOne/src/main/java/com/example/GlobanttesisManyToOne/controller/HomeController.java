package com.example.GlobanttesisManyToOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/")
    public String Hello(){
        return "index";
    }
}
