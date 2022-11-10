package com.example.Clase22.Service.impl;

import com.example.Clase22.Entities.Entrenador;
import com.example.Clase22.Service.IEntrenadorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntrenadorService implements IEntrenadorService {

    @Override
    public List<Entrenador> obtenerEntrenadores(){
        List<Entrenador> entrenadores = new ArrayList<>();
        entrenadores.add(new Entrenador("Franco"));
        entrenadores.add(new Entrenador("Flor"));
        entrenadores.add(new Entrenador("Laura"));
        return entrenadores;
    }

}
