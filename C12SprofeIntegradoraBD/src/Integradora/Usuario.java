package Integradora;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.sql.*;

public class Usuario {
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO "
            + "("
            + " ID INT PRIMARY KEY,"
            + " PRIMER_NOMBRE varchar(20) NOT NULL, "
            + " APELLIDO varchar(20) NOT NULL, "
            + " EDAD INT NOT NULL "
            + " )";
    private static final String SQL_INSERT = "INSERT INTO USUARIO " +
            "(ID,PRIMER_NOMBRE,APELLIDO,EDAD)" +
            " VALUES (1,'Flor','Alonso',25)";

    private static final String SQL_INSERT2 = "INSERT INTO USUARIO " +
            "(ID,PRIMER_NOMBRE,APELLIDO,EDAD)" +
            " VALUES (2,'Laura','Vera',26)";

    private static final String SQL_INSERT3 = "INSERT INTO USUARIO " +
            "(ID,PRIMER_NOMBRE,APELLIDO,EDAD)" +
            " VALUES (3,'Amy','Montenegro',26)";
    private static final String SQL_DELETE =  "DELETE FROM USUARIO WHERE ID=2";

    private static final Logger logger = Logger.getLogger(Usuario.class);

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            File file = new File("./src/Integradora/config/log4j.properties");
            PropertyConfigurator.configure(file.getAbsolutePath());

            connection = getConnection();

            logger.info("Se conecto a la BD");

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            logger.info("Se creo la tabla");

            Statement statementIns = connection.createStatement();
            statementIns.execute(SQL_INSERT);

            logger.info("Se inserto al usuario con ID 1");

            Statement statementIns2 = connection.createStatement();
            statementIns2.execute(SQL_INSERT2);

            logger.info("Se inserto al usuario con ID 2");

            Statement statementIns3 = connection.createStatement();
            statementIns3.execute(SQL_INSERT3);

            logger.info("Se inserto al usuario con ID 3");

            Statement statementDEl = connection.createStatement();
            statementDEl.execute(SQL_DELETE);

            logger.info("Se elimino al usuario con el ID 2");


        } catch (Exception e) {
            logger.error("No se pudo conectar a la BD");
        } finally {
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","","");
    }

}
