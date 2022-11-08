package Menus;

public class MenuVegetariano extends Menu{

    private int recargoSalsas;
    private int cantidadSalsas;
    private int recargoEspecias;

    public MenuVegetariano(double precioBase, int cantidadSalsas) {
        super(precioBase);
        this.recargoSalsas = 2;
        this.cantidadSalsas = cantidadSalsas;
        this.recargoEspecias = 1;
    }

    public int getRecargoSalsas() {
        return recargoSalsas;
    }

    public void setRecargoSalsas(int recargoSalsas) {
        this.recargoSalsas = recargoSalsas;
    }

    public int getCantidadSalsas() {
        return cantidadSalsas;
    }

    public void setCantidadSalsas(int cantidadSalsas) {
        this.cantidadSalsas = cantidadSalsas;
    }

    public int getRecargoEspecias() {
        return recargoEspecias;
    }

    public void setRecargoEspecias(int recargoEspecias) {
        this.recargoEspecias = recargoEspecias;
    }

    @Override
    public double calcularPrecioFinal() {
        return (getPrecioBase() + (recargoSalsas * cantidadSalsas)) + ((getPrecioBase() * recargoEspecias)/100);
    }
}
