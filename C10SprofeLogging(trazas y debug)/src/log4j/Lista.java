package log4j;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private static final Logger logger = Logger.getLogger(Lista.class);

    private List<Integer> lista = new ArrayList<>();

    public Lista(List<Integer> enteros) throws Exception{
        this.lista = enteros;

        if(lista.size()>5){
            logger.info("La longitud de la lista es mayor a 5 ");
        }
        if(lista.size()>10){
            logger.info("La longitud de la lista es mayor a 10 ");
        }
        if(lista.size()==0){
            throw new Exception();
        }

    }
    /*
    mesas
    public int promedio(){

    }
    */

    public List<Integer> getLista(){
        return this.lista;
    }
}