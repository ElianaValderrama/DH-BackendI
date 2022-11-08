package Clase_Integradora;

public abstract class Vendedor {

    protected String categoria;
    protected int puntos;
    protected int ventas;

    public Vendedor(int ventas) {
        this.ventas = ventas;
    }

    public abstract int calcularPuntos();

    public String mostrarCategoria(){
        int puntos = calcularPuntos();
        return "Tiene un total de "+puntos+" y una categoria de " + recategorizar();
    }

    public String recategorizar(){
        int puntos = calcularPuntos();
        if(puntos < 20){
            return "novato";
        }else if(puntos < 31){
            return "aprendiz";
        }else if(puntos < 41){
            return "bueno";
        }
        else{
            return "maestro";
        }
    }

}
