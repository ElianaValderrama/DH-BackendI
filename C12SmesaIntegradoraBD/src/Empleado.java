import org.apache.log4j.Logger;

import java.sql.*;

public class Empleado {

    private static final Logger myLogger = Logger.getLogger(Empleado.class);

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADOS; CREATE TABLE EMPLEADOS" +
            "(" +
            "ID INT PRIMARY KEY, " +
            "NOMBRE varchar(100) NOT NULL," +
            "APELLIDO varchar(100) NOT NULL," +
            "EDAD INT NOT NULL," +
            "EMAIL varchar(100) NOT NULL" +
            ")";

    private static final String SQL_INSERT1 = "INSERT INTO EMPLEADOS (ID,NOMBRE,APELLIDO,EDAD,EMAIL) " +
            "VALUES(1,'Cosme','Fulanito',35,'cosmefulano@gmail.com')";

    private static final String SQL_INSERT2 = "INSERT INTO EMPLEADOS (ID,NOMBRE,APELLIDO,EDAD,EMAIL) " +
            "VALUES(2,'Franco','Insaurralde',29,'franco.insaurralde@digitalhouse.com')";
    private static final String SQL_INSERT3 = "INSERT INTO EMPLEADOS (ID,NOMBRE,APELLIDO,EDAD,EMAIL) " +
            "VALUES(3,'Esteban','Quito',25,'estebanquito@gmail.com')";

    private static final String SQL_INSERT4 = "INSERT INTO EMPLEADOS (ID,NOMBRE,APELLIDO,EDAD,EMAIL) " +
            "VALUES(3,'Martin','Gonzales',35,'martingonza@gmail.com')";

    private static final String SQL_UPDATE1 = "UPDATE EMPLEADOS SET NOMBRE " +
            "= 'Mario', APELLIDO = 'Neta' WHERE ID = 3;";

    private static final String SQL_DELETE1 = "DELETE FROM EMPLEADOS WHERE ID=1";

    private static final String SQL_DELETE2 = "DELETE FROM EMPLEADOS WHERE NOMBRE='Franco'";

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try{
            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statement1 = connection.createStatement();
            statement1.execute(SQL_INSERT1);

            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT2);

            Statement statement3 = connection.createStatement();
            statement3.execute(SQL_INSERT3);

            Statement statement4 = connection.createStatement();
            statement4.execute(SQL_UPDATE1);

            myLogger.debug("Se cambió a Esteban Quito por Mario Neta");



            Statement statement6 = connection.createStatement();
            statement6.execute(SQL_DELETE1);

            myLogger.info("Se borró a Cosme Fulanito");

            Statement statement7 = connection.createStatement();
            statement7.execute(SQL_DELETE2);

            myLogger.info("Se borró a Franco Israelita");

//            Statement statement5 = connection.createStatement();
//            statement5.execute(SQL_INSERT4);

        }catch (Exception e){
            //e.printStackTrace();
            myLogger.error("Error debido a: " + e.getMessage());
        }finally {
            connection.close();
        }
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","","");
    }
}
