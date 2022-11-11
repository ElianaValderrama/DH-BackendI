package Proxy;

public class RegistroVacuna implements Registro{

    @Override
    public void registrar(Persona persona) {
        System.out.println(persona);
    }

}
