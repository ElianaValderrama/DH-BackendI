package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        File log4jfile = new File("./src/log4j/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());
        List<Integer> arrayList_1 = new ArrayList<>();
        List<Integer> arrayList_2 = new ArrayList<>();
        List<Integer> arrayList_3 = new ArrayList<>();
        arrayList_1.add(1);
        arrayList_1.add(2);
        arrayList_1.add(3);
        arrayList_1.add(4);
        arrayList_1.add(5);

        arrayList_2.add(6);
        arrayList_2.add(7);
        arrayList_2.add(8);
        arrayList_2.add(9);
        arrayList_2.add(10);


        //logger.info("El logger está funcionando"); //Para ver si está funcionando el logger
        try{
            Lista lista1 = new Lista(arrayList_1);
            Lista lista2 = new Lista(arrayList_2);

            Double promedio1 = lista1.promedio();
            logger.info("El promedio de la lista 1 es: "+ promedio1.toString());
            Double promedio2 = lista2.promedio();
            logger.info("El promedio de la lista 2 es: "+ promedio2.toString());
            Lista lista3 = new Lista(arrayList_3);
            Double promedio3 = lista3.promedio();
            logger.info("El promedio de la lista 3 es: "+ promedio3.toString());
        } catch (Exception e){
            logger.error("La lista es igual a cero");
        }

    }
}
