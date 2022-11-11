package Arboles;

import java.util.HashMap;
import java.util.Map;

public class Flyweigth {

    private static Map<String, Arboles> arbol = new HashMap<>();

    public Arboles getArboles(String categoria) {
        if (categoria.equalsIgnoreCase("ornamentales")) {
            if (arbol.containsKey(categoria)) {
                Arboles arbolEncontrado = arbol.get(categoria);
                arbolEncontrado.setAlto(200);
                arbolEncontrado.setAncho(400);
                arbolEncontrado.setColor("verde");
            } else {
                arbol.put(categoria, new Arboles(200, 400, "verde"));
            }
        } else if (categoria.equalsIgnoreCase("frutales")) {
            if (arbol.containsKey(categoria)) {
                Arboles arbolEncontrado = arbol.get(categoria);
                arbolEncontrado.setAlto(500);
                arbolEncontrado.setAncho(300);
                arbolEncontrado.setColor("rojo");
            } else {
                arbol.put(categoria, new Arboles(500, 300, "rojo"));
            }
        } else if (categoria.equalsIgnoreCase("florales")) {
            if (arbol.containsKey(categoria)) {
                Arboles arbolEncontrado = arbol.get(categoria);
                arbolEncontrado.setAlto(100);
                arbolEncontrado.setAncho(200);
                arbolEncontrado.setColor("celeste");
            } else {
                arbol.put(categoria, new Arboles(100, 200, "celeste"));
            }
        }
        return arbol.get(categoria);
    }
}
