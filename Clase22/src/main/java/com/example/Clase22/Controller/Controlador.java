package com.example.Clase22.Controller;

import com.example.Clase22.Entities.Entrenador;
import com.example.Clase22.Service.impl.EntrenadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entrenador")
public class Controlador {

    //localhost:8080/entrenador/entrenadores

    private EntrenadorService entrenadorService;

    public Controlador(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping()
    public List<Entrenador> obtenerEntrenadores(){
        return entrenadorService.obtenerEntrenadores();
    }

    @GetMapping("/holamundo")
    public String holamundo(){
        return "hola mundo";
    }

}
