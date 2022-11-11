package com.example.Clase23.Services;

import com.example.Clase23.Models.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteService implements IPacienteService{

    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteService(){
        pacientes.add(new Paciente(1L,"Franco", "Insaurralde", "franco@mail.com",
                123456,new Date()));
        pacientes.add(new Paciente(2L,"Flor","Alonso","flor@mail.com",
                123456,new Date()));
    };

    @Override
    public List<Paciente> obtenerTodosLosPacientes() {
        return pacientes;
    }

    @Override
    public Paciente encontrarPorEmail(String email) {
        for(Paciente paciente : pacientes){
            if (paciente.getEmail().equals(email)){
                return paciente;
            }
        }
        return null;
    }
}
