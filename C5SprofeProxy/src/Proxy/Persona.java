package Proxy;

import java.util.Date;

public class Persona {

    private String nombre;
    private String dni;
    private String vacuna;
    private Date fecha;

    public Persona(String nombre, String dni, String vacuna, Date fecha) {
        this.nombre = nombre;
        this.dni = dni;
        this.vacuna = vacuna;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", vacuna='" + vacuna + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
