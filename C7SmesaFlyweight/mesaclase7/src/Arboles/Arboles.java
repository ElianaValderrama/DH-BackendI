package Arboles;

public class Arboles {

    private int alto;
    private int ancho;
    private String color;

    public Arboles(int alto, int ancho, String color) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arboles{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", color='" + color + '\'' +
                '}';
    }
}
