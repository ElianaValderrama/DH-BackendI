package com.example.Clase23.Controller;

import com.example.Clase23.Models.Paciente;
import com.example.Clase23.Services.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class PacienteControlador {


    //localhost:8080/franco@mail.com
    private PacienteService pacienteService;

    public PacienteControlador(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/todos")
    public List<Paciente> obtenerTodos(){
        return pacienteService.obtenerTodosLosPacientes();
    }

    @GetMapping("/{email}")
    public String obtenerPacientePorEmail(@PathVariable("email") String email, Model model){

        Paciente paciente = pacienteService.encontrarPorEmail(email);

        if(paciente == null){
            return "error";
        }

        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());

        return "email";

    }

}
