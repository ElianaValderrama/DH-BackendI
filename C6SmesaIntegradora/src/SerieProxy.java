import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SerieProxy implements ISerie{
    private HashMap<String, Integer> cantVistas;
    private Serie serie;
    public SerieProxy() {
        cantVistas = new HashMap<>();
        serie = new Serie();
    }

    public String contarSerie(String nombre) throws SerieNoHabilitadaException{
        String nombreDeSerie = getPelicula(nombre);
        if (cantVistas.containsKey(nombreDeSerie)){
            cantVistas.put(nombreDeSerie,cantVistas.get(nombreDeSerie) + 1);
            if (cantVistas.get(nombreDeSerie)>5){
                throw new SerieNoHabilitadaException("Ha superado la cantidad de reproducciones permitidas");
            }
        }else{
            cantVistas.put(nombreDeSerie,1);
        }
        return nombreDeSerie;
    }

    @Override
    public String getPelicula(String nombre) {
        return serie.getPelicula(nombre);
    }
}
