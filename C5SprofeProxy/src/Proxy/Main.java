package Proxy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan","12345678","Pfizer",new Date(122,9,18));
        Persona persona1 = new Persona("Juan","12345678","Sinopham",new Date(122,9,30));
        RegistroProxy proxy = new RegistroProxy();
        proxy.registrar(persona);
        proxy.registrar(persona1);

    }
}
