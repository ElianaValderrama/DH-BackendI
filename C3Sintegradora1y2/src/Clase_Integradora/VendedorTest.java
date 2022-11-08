package Clase_Integradora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {
    @Test
    void mostrarCategoriaEmpleado(){

        Empleado empleado = new Empleado(5,2);
        Afiliado afiliado = new Afiliado(2);
        empleado.conseguirAfiliado(afiliado);
        empleado.calcularPuntos();

        String respuestaEmpleado = "Tiene un total de 45 y una categoria de maestro";

        String resultadoEmpleado = empleado.mostrarCategoria();

        Assertions.assertEquals(respuestaEmpleado,resultadoEmpleado);
    }

    @Test
    void mostrarCategoriaAfiliado(){
        Afiliado afiliado = new Afiliado(2);
        afiliado.calcularPuntos();
        String respuestaAfiliado = "Tiene un total de 30 y una categoria de aprendiz";
        String resultadoAfiliado = afiliado.mostrarCategoria();
        Assertions.assertEquals(respuestaAfiliado,resultadoAfiliado);
    }

    @Test
    void mostrarCategoriaPasante(){
        Pasante pasante = new Pasante(4);
        pasante.calcularPuntos();
        String respuestaPasante = "Tiene un total de 20 y una categoria de pasante novato";
        String resultadoPasante = pasante.mostrarCategoria();
        Assertions.assertEquals(respuestaPasante,resultadoPasante);
    }

}