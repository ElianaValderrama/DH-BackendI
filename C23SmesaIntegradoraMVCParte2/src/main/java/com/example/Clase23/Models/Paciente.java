package com.example.Clase23.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paciente {

    private Long id;

    private String nombre;

    private String apellido;

    private String email;

    private int dni;

    private Date FechaIngreso;

    //private Odontologo odontologo;

}
