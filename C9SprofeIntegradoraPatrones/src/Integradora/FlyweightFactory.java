package Integradora;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    public static final Map<String,Triangulo> triangulos = new HashMap<>();

    public static Triangulo getTriangulo(String color){
        Triangulo triangulo = triangulos.get(color);
        if(triangulo == null){
            triangulo = new Triangulo(color);
            triangulos.put(color,triangulo);
            System.out.println("Se creo un nuevo triangulo");
        }
        return triangulo;
    }

}
