package log4j;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private static final Logger logger = Logger.getLogger(Lista.class);

    private List<Integer> lista;

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

    public Double promedio(){
        Integer suma = 0;
        for (int i = 0; i < lista.size(); i++){
            suma += lista.get(i); // suma = suma + lista.get(i);
        }
        return  ((double)suma/ lista.size());
    }


    public List<Integer> getLista(){
        return this.lista;
    }
}