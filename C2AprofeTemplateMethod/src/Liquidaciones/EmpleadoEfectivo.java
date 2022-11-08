package Liquidaciones;

public class EmpleadoEfectivo extends Empleado{
    private int sueldo;
    private int bonos;
    private int descuentos;

    public EmpleadoEfectivo(String nombre, String cuenta, int sueldo, int bonos, int descuentos) {
        super(nombre, cuenta);
        this.sueldo = sueldo;
        this.bonos = bonos;
        this.descuentos = descuentos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getBonos() {
        return bonos;
    }

    public void setBonos(int bonos) {
        this.bonos = bonos;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }
}
