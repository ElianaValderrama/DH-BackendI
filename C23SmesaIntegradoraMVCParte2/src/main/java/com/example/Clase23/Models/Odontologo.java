package com.example.Clase23.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Odontologo {
    private String id;
    private String nombre;
    private String apellido;
    private String matricula;
}
