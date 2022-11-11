package Clase15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {

    private static final String SQL_CREATE_TABLE =" DROP TABLE IF EXISTS PACIENTES; CREATE TABLE PACIENTES " +
            "(ID INT AUTO_INCREMENT PRIMARY KEY, " +
            "NOMBRE varchar(100), " +
            "APELLIDO varchar(100), " +
            "DNI INT NOT NULL, " +
            "fecha_ingreso DATE NOT NULL, " +
            "domicilio_id LONG NOT NULL);" +

            "DROP TABLE IF EXISTS DOMICILIOS; CREATE TABLE DOMICILIOS " +
            "(domicilio_id LONG AUTO_INCREMENT PRIMARY KEY, " +
            "CALLE varchar(100), " +
            "NUMERO varchar(100), " +
            "LOCALIDAD varchar(100) NOT NULL, " +
            "PROVINCIA varchar(100) NOT NULL)";

    public static void crearBD() throws Exception{
        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","","");
    }

}
