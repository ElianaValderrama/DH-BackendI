package Menus;

public class Empleado {

    public String armado(Menu menu) {
        String precioFinal = "El precio final es " + menu.calcularPrecioFinal();
        return precioFinal;
    }

}
