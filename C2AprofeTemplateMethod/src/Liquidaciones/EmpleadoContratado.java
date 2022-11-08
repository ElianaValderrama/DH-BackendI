package Liquidaciones;

public class EmpleadoContratado extends Empleado{

    private int horasTrabajadas;

    private int valorHora;

    public EmpleadoContratado(String nombre, String cuenta, int horasTrabajadas, int valorHora) {
        super(nombre, cuenta);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
}
