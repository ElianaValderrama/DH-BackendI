package com.digitalhouse.junit.vivo;

public class Persona {

    private String nombre;
    private String apellido;
    private String mail;
    private Integer edad;

    public Persona(String nombre, String apellido, String mail, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String mostrarNombre(){
        String mensaje = "Nombre completo: " +getApellido()+ ", " +getNombre();
        return mensaje;
    }

    public boolean calcularEdad(){
        if(getEdad()>18){
            return true;
        }else {
            return false;
        }
    }

}
