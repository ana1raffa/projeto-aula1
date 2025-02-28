package com.fatec.projeto.projeto2025.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class exercicioController {
    @GetMapping("")
    public String HelloWorld(){
        return "Hello";    
    
    }


    @GetMapping("{idade}")
    public String VerificarIdade(@PathVariable Optional<String> idade){
        idade.ifPresent(value -> System.out.println("Idade: " + value)); 
        int idadeInt = Integer.parseInt(idade.get());
        if (idadeInt > 0 && idadeInt < 12 ){
            return "Criança";
        } else if (idadeInt >= 12 && idadeInt <=18){
            return "Adolescente";
        }else if (idadeInt >= 19 && idadeInt <=60){
            return "Adulto";
        }else if (idadeInt > 60){
            return "Idoso";
        } else{
            return "Idade Inválida";
        }
     
    
    }
  

}
