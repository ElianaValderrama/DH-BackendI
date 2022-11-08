package Liquidaciones;

public abstract class Liquidador {

    public abstract String liquidarSueldo(Empleado empleado);

    public String depositarSueldo(Empleado empleado){
        return "Sueldo depositado en la cuenta "+ empleado.getCuenta();
    }
}
