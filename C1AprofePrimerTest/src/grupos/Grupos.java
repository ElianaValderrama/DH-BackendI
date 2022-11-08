package grupos;

import java.util.ArrayList;
import java.util.List;

public class Grupos {

    private List<Persona> listaPersonas = new ArrayList<>();

    public Grupos() {
    }

    public void agregarPersona(Persona p){
        if(p.esMayorDeEdad() && p.getNombre().length()>=5){
            listaPersonas.add(p);
        }else {
            System.err.println("no se puede agregar a "+p);
        }
    }

    public Integer getPersonasEnElGrupo(){
        return this.listaPersonas.size();
    }

}
