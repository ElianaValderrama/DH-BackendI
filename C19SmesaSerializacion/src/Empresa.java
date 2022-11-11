import empleados.Empleado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {

    private String razonSocial;

    private Integer CUIT;
    private List<Empleado> empleados = new ArrayList<>();

    public Empresa(String razonSocial, Integer CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCUIT() {
        return CUIT;
    }

    public void setCUIT(Integer CUIT) {
        this.CUIT = CUIT;
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
                ", CUIT=" + CUIT +
                ", empleados=" + empleados +
                '}';
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
}
