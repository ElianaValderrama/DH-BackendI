package Clase_Integradora;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Vendedor{

    private int antiguedad;
    private List<Afiliado> afiliados = new ArrayList<>();

    public Empleado(int ventas, int antiguedad) {
        super(ventas);
        this.antiguedad = antiguedad;
    }

    public void conseguirAfiliado(Afiliado afiliado){
        this.afiliados.add(afiliado);
    }

    @Override
    public int calcularPuntos() {
        this.puntos = (this.antiguedad*5+this.afiliados.size()*10+this.ventas*5);
        return puntos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public List<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(List<Afiliado> afiliados) {
        this.afiliados = afiliados;
    }
}
