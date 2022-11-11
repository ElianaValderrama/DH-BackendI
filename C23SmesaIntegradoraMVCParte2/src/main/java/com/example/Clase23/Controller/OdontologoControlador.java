package com.example.Clase23.Controller;

import com.example.Clase23.Models.Odontologo;
import com.example.Clase23.Models.Paciente;
import com.example.Clase23.Services.OdontologoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class OdontologoControlador {

    private OdontologoService odontologoService;

    public OdontologoControlador(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @GetMapping("/odontologos/obtenerTodos")
    public List<Odontologo> obtenerTodos(){
        return odontologoService.obtenerTodos();
    }

    @GetMapping("/odontologos/{id}")
    public String obtenerPacientePorEmail(@PathVariable("id") String id, Model model){

        Odontologo odontologo = odontologoService.encontrarPorEmail(id);

        if(odontologo == null){
            return "error";
        }

        model.addAttribute("nombre",odontologo.getNombre());
        model.addAttribute("apellido",odontologo.getApellido());
        model.addAttribute("matricula",odontologo.getMatricula());
        return "id";

    }
}
