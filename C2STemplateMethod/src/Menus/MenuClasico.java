package Menus;

public class MenuClasico extends Menu{

    public MenuClasico(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase();
    }


}
