package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        File log4jfile = new File("./src/log4j/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Lista lista1 = null;
        Lista lista2 = null;
        Lista lista3 = null;

        try{

        } catch (Exception e){

        }

    }
}
