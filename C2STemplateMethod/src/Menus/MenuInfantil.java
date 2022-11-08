package Menus;

public class MenuInfantil extends Menu{

    private double adicionalRegalo;
    private int cantidadJuguetes;

    public MenuInfantil(double precioBase, int cantidadJuguetes) {
        super(precioBase);
        this.adicionalRegalo = 3;
        this.cantidadJuguetes = cantidadJuguetes;
    }

    public double getAdicionalRegalo() {
        return adicionalRegalo;
    }

    public void setAdicionalRegalo(double adicionalRegalo) {
        this.adicionalRegalo = adicionalRegalo;
    }

    public int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + (adicionalRegalo * cantidadJuguetes);
    }
}
