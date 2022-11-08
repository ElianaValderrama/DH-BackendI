package Liquidaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    public void test1(){
        //dado
        Liquidador liquidador = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Martin","123",400,60,40);
        String resultado = "La liquidacion se hizo correctamente 420";
        //cuando
        String resultadoefectivo = liquidador.liquidarSueldo(empleado);
        //entonces
        Assertions.assertEquals(resultado,resultadoefectivo);
    }

    @Test
    public void test2(){
        //dado
        Empleado empleado = new EmpleadoContratado("Martin","123",400,10);
        Liquidador liquidador = new LiquidadorEmpleadoContratado();

        String resultado = "La liquidacion se hizo correctamente 4000";
        //cuando
        String resultadoefectivo = liquidador.liquidarSueldo(empleado);
        //entonces
        Assertions.assertEquals(resultado,resultadoefectivo);
    }

    @Test
    public void test3(){
        //Dado
        Empleado empleado = new EmpleadoContratado("Martin","123",400,10);
        Liquidador liquidador = new LiquidadorEmpleadoEfectivo();
        String resultado = "La liquidacion no pudo se calculada";
        //cuando
        String resultadoefectivo = liquidador.liquidarSueldo(empleado);
        //entonces
        Assertions.assertEquals(resultado,resultadoefectivo);
    }
}