package Proxy;

import java.util.Date;

public class RegistroProxy implements Registro{

    private Persona persona;

    @Override
    public void registrar(Persona persona) {
        if(comprobarFecha(persona.getFecha())){
            RegistroVacuna registroVacuna = new RegistroVacuna();
            registroVacuna.registrar(persona);
        }
    }

    public boolean comprobarFecha(Date fecha){
        return fecha.before(new Date());
    }
}
