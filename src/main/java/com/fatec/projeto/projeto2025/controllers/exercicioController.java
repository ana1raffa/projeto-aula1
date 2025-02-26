package com.fatec.projeto.projeto2025.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class exercicioController {

    @GetMapping("")
    public String Helloworld(){
        return "Hello";
    }

     @GetMapping("{nome}")
    public String Helloworld(@PathVariable Optional<String> nome){
        return nome.isPresent () ? nome.get(): "dd";
    }

}
