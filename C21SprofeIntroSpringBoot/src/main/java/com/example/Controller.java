package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String holamundo(){
        return "hola mundo";
    }
}

//Get  READ
//Post CREATE
//Put  UPDATE
//Delete DELETE