package Clase_Integradora;

public class Afiliado extends Vendedor{
    public Afiliado(int ventas) {
        super(ventas);
    }

    @Override
    public int calcularPuntos() {
        this.puntos = this.ventas*15;
        return this.puntos;
    }
}
