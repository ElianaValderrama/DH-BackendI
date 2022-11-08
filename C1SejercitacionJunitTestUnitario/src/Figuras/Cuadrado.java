package Figuras;

public class Cuadrado extends Figura{
    public Cuadrado(String nombreFigura, double unidadCalculo) {
        super(nombreFigura, unidadCalculo);
    }

    @Override
    public String calcularArea(Figura figura) {
        String mensaje = "El valor del lado debe ser mayor que cero";
        double resultado = 0;

        if (figura.getUnidadCalculo() > 0) {
            resultado = getUnidadCalculo() * getUnidadCalculo();
            return "El area del Cuadrado es " + resultado + " unidades";
        }

        return mensaje;
    }
}
