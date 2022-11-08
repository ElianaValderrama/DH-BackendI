package com.digitalhouse.junit.vivo;

public class Animal {

    private String tipo; //caballo, perro, gato
    private String tamaño; //grande, mediano y chico
    private Integer peso;

    public Animal(String tipo, String tamaño, Integer peso) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public boolean esPesado(){
        return this.peso > 2000 && this.tamaño.equals("grande");
    }

}
