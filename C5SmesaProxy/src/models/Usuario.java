package models;

public class Usuario {

    private Integer identificador;
    private String suscripcion;

    public Usuario(Integer identificador, String suscripcion) {
        this.identificador = identificador;
        this.suscripcion = suscripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }
}
