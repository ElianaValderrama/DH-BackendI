package Figuras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {

    @Test
    public void testCirculo() {

        Circulo circulo = new Circulo("Circulo", 2.0);

        String resultado = circulo.calcularArea(circulo);

        Assertions.assertEquals("El area del Circulo es 12.56 unidades", resultado);
    }

    @Test
    public void testCuadrado (){
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 2.0);

        String resultado = cuadrado.calcularArea(cuadrado);

        Assertions.assertEquals("El area del Cuadrado es 4.0 unidades", resultado);

    }

}