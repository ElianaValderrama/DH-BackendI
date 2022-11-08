package Menus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    public void testMenuClasico(){

        Menu menu = new MenuClasico(100);
        Empleado empleado = new Empleado();
        String resultadoActual = empleado.armado(menu);
        String resultadoEsperado = "El precio final es 100.0";
        Assertions.assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testMenuInfantil(){

        Menu menu = new MenuInfantil(100, 2);
        Empleado empleado = new Empleado();
        String resultado = empleado.armado(menu);
        String resultadoEsperado = "El precio final es 100.0";
        Assertions.assertEquals("El precio final es 106.0", resultado);
    }
    @Test
    public void testMenuVegetariano(){

        Menu menu = new MenuVegetariano(100, 2);
        Empleado empleado = new Empleado();
        String resultado = empleado.armado(menu);
        String resultadoEsperado = "El precio final es 100.0";
        Assertions.assertEquals("El precio final es 105.0", resultado);
    }
}