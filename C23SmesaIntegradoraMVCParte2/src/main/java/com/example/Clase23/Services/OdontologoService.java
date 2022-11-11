package com.example.Clase23.Services;

import com.example.Clase23.Models.Odontologo;
import com.example.Clase23.Models.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService implements IPacienteService{
    List<Odontologo> odontologos = new ArrayList<>();

    public OdontologoService() {
        odontologos.add(new Odontologo("1","Doctor","Juarez","001"));
        odontologos.add(new Odontologo("2","Doctor","Mayorca","002"));
    }

    @Override
    public List<Odontologo> obtenerTodos() {
        return odontologos;
    }

    @Override
    public Odontologo encontrarPorEmail(String id) {
        for(Odontologo odontologo : odontologos){
            if (odontologo.getId().equals(id)){
                return odontologo;
            }
        }
        return null;
    }
}
