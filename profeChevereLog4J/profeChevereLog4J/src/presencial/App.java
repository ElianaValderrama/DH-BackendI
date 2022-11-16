package presencial;

import java.util.ArrayList;
import java.util.List;

//debe ser este import para que log4j funcione
import org.apache.log4j.Logger;

public class App {

    //vincular al jar de log4j por medio de la sigueinte linea
    private static final Logger logger = Logger.getLogger(App.class);
    private List<Integer> listaEnteros;

    public App(){
        listaEnteros = new ArrayList<>();
    }

    public void agregarEntero(Integer n){
        listaEnteros.add(n);
        if(listaEnteros.size()>5){
            //aqui tenemos que escribir en el log
            logger.info("La lista tiene mas de 5 elementos, elementos totales: "+listaEnteros.size());
        }
    }

    public Integer calcularPromedio() throws Exception {
        if (listaEnteros.isEmpty()){
            Exception error = new Exception("la lista es igual a cero");
            logger.error(error.getMessage());
            throw error;
        }
        else {
            Integer total =0;
            for (Integer i:listaEnteros){
                total+=i;
            }
            Integer promedio = total/listaEnteros.size();
            logger.info("El promedio dio: "+promedio);
            return promedio;
        }
    }

}
