package presencial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            +" (ID INT PRIMARY KEY,"
            +" PRIMER_NOMBRE varchar(100) NOT NULL, "
            +" EDAD INT NOT NULL, "
            +" APELLIDO varchar(100) NOT NULL "
            +" )";

    private static final String SQL_INSERT = "INSERT INTO USUARIO (ID, PRIMER_NOMBRE, APELLIDO, EDAD) VALUES (1, 'Pedro', 'CASAS', 60)";
    private static final String SQL_INSERT2 = "INSERT INTO USUARIO (ID, PRIMER_NOMBRE, APELLIDO, EDAD) VALUES (2, 'Maria', 'ZAPATO', 60)";
    private static final String SQL_INSERT3 = "INSERT INTO USUARIO (ID, PRIMER_NOMBRE, APELLIDO, EDAD) VALUES (3, 'Coco', 'COCONUT', 60)";

    private static final String SQL_SELECT = "SELECT * FROM USUARIO";
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    public static void main(String[] args) throws Exception{
        Connection connection = null;

        try {
            connection=getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statement1 = connection.createStatement();
            statement1.execute(SQL_INSERT);
            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT2);
            Statement statement3 = connection.createStatement();
            statement3.execute(SQL_INSERT3);

            //MOSTRAR LA INFORMACION
            Statement statementSelect = connection.createStatement();
            ResultSet rs = statementSelect.executeQuery(SQL_SELECT);

            while (rs.next()){
                System.out.println("ID: "+rs.getInt(1)+" - nombre: "+rs.getString(2)+" - apellido: "+rs.getString(4)+" - edad: "+rs.getInt(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }
}
