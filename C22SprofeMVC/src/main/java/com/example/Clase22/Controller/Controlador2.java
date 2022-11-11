package com.example.Clase22.Controller;

import com.example.Clase22.Entities.Entrenador;
import com.example.Clase22.Service.impl.EntrenadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entrenador")
public class Controlador2 {

    private EntrenadorService entrenadorService;

    public Controlador2(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping()
    public List<Entrenador> alumnos(){
        return entrenadorService.obtenerEntrenadores();
    }

    @GetMapping("/holaalumno")
    public String holamundo(){
        return "hola mundo";
    }

}
