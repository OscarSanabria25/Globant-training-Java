package com.example.testingPrueba.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/")
    public  String mostrarPagina(Model model){
        model.addAttribute("titulo", "hola aprendiendo spring");
        return "index";
    }
}
