/*Se debe desarrollar un programa que permita calcular el área de una figura geométrica,
  la cual puede ser un círculo o un cuadrado. El programa debe responder el mensaje:
  “El área del X es Y unidades”, donde X es el tipo de figura geométrica y Y es el valor calculado del área.
  Las fórmulas para el cálculo del área del círculo y del cuadrado son:
  Círculo: 𝜋 r2
  Cuadrado: L2
  Para el cálculo de las áreas será necesario recibir como parámetro el radio del círculo
  o el lado del cuadrado, cuyos valores deben ser mayores que cero. En caso de que esta condición no se cumpla,
  se debe imprimir el mensaje: “El valor del radio o lado debe ser mayor que cero”.
  Recordemos siempre qué casos de prueba van a ser requeridos antes de implementar la lógica de los métodos.*/


        package Figuras;

public abstract class Figura {
    private String nombreFigura;
    private double unidadCalculo;

    public Figura(String nombreFigura, double unidadCalculo) {
        this.nombreFigura = nombreFigura;
        this.unidadCalculo = unidadCalculo;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public double getUnidadCalculo() {
        return unidadCalculo;
    }

    public void setUnidadCalculo(double unidadCalculo) {
        this.unidadCalculo = unidadCalculo;
    }

    public abstract String calcularArea(Figura figura);
}
