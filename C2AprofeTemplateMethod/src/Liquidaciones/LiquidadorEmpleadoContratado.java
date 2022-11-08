package Liquidaciones;

public class LiquidadorEmpleadoContratado extends Liquidador{
    @Override
    public String liquidarSueldo(Empleado empleado) {
        String mensaje = "La liquidacion no pudo se calculada";

        if(empleado instanceof EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            int sueldoFinal = empleadoContratado.getHorasTrabajadas()* empleadoContratado.getValorHora();
            mensaje = "La liquidacion se hizo correctamente "+sueldoFinal;
        }
        return mensaje;
    }
}
