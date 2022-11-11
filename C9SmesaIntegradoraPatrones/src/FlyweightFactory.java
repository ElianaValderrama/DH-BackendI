import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    public static Map<String, Ropa> prendas = new HashMap<>();

    public Ropa getRopa(String tipo){
        Ropa ropaEncontrada = prendas.get(tipo);

        if (ropaEncontrada == null){// ropaEncontrada == null
            Ropa ropaParaCrear = new Ropa(tipo);
            prendas.put(tipo, ropaParaCrear);
            ropaEncontrada = prendas.get(tipo);
            System.out.println("Se creó una prenda: " + ropaParaCrear.toString());
        }
        return ropaEncontrada;
    }
}
