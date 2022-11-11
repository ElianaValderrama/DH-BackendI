package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {

    private static Map<String,Computadora> computadoras = new HashMap<>();

    public Computadora getComputadora(int ram, int disco){

        String clave = "key " + ram + "" +disco;

        if(!computadoras.containsKey(clave)){
            computadoras.put(clave,new Computadora(ram,disco));
            System.out.println("Pc creada");
        }
        return computadoras.get(clave);
    }
}
