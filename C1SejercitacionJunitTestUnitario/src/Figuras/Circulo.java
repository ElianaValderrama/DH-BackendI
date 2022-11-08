package Figuras;

public class Circulo extends Figura{
    public Circulo(String nombreFigura, double unidadCalculo) {
        super(nombreFigura, unidadCalculo);
    }

    @Override
    public String calcularArea(Figura figura) {
        String mensaje = "El valor del radio debe ser mayor que cero";
        double resultado = 0;

        if (figura.getUnidadCalculo() > 0) {
            resultado = 3.14 * getUnidadCalculo() * getUnidadCalculo();
            return "El area del Circulo es " + resultado + " unidades";
        }

        return mensaje;

    }
}
