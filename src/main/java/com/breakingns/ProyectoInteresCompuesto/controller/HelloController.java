package com.breakingns.ProyectoInteresCompuesto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/saludo")
    public String sayHello(){
        return "Funciona wachiiiin!";
    }
    
}

