package Liquidaciones;

public class LiquidadorEmpleadoEfectivo extends Liquidador{
    @Override
    public String liquidarSueldo(Empleado empleado) {
        String mensaje = "La liquidacion no pudo se calculada";

        if(empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            int sueldoFinal = empleadoEfectivo.getSueldo() + empleadoEfectivo.getBonos() - empleadoEfectivo.getDescuentos();
            mensaje = "La liquidacion se hizo correctamente "+sueldoFinal;
        }
        return mensaje;
    }
}
