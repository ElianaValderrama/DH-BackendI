package Clase_Integradora;

public class Pasante extends Vendedor{


    public Pasante(int ventas) {
        super(ventas);
    }

    public String recategorizar(){
        int puntos = calcularPuntos();
        if(puntos < 50){
            return "pasante novato";
        }
        else{
            return "pasante experimentado";
        }
    }

    @Override
    public int calcularPuntos() {
        this.puntos = this.ventas*5;
        return this.puntos;
    }
}
