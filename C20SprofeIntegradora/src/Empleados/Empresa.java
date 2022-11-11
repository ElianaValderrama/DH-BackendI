package Empleados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {

    private String razonSocial;
    private int cuit;

    private List<Empleado> empleados;

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        empleados = new ArrayList<>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                ", cuit=" + cuit +
                '}';
    }
}
