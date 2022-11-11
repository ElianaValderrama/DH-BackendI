public class Ropa {

    private String talla;
    private String tipo;
    private Boolean esNuevo;
    private Boolean esInternacional;

    public Ropa(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(Boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public Boolean getEsInternacional() {
        return esInternacional;
    }

    public void setEsInternacional(Boolean esInternacional) {
        this.esInternacional = esInternacional;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "talla='" + talla + '\'' +
                ", tipo='" + tipo + '\'' +
                ", esNuevo=" + esNuevo +
                ", esInternacional=" + esInternacional +
                '}';
    }
}
