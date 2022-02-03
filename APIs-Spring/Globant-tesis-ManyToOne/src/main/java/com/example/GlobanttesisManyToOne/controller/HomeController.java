package com.example.GlobanttesisManyToOne.controller;

import com.example.GlobanttesisManyToOne.model.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String Hello(){
        return "index";
    }


}
