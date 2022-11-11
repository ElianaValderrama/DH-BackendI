package com.example.Clase23.Services;

import com.example.Clase23.Models.Paciente;

import java.util.List;

public interface IPacienteService {

    List<Paciente> obtenerTodosLosPacientes();


    Paciente encontrarPorEmail(String email);

}
