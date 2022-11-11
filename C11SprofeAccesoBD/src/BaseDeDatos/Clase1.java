package BaseDeDatos;

import java.sql.*;

public class Clase1 {

    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES " +
            "(" +
            "ID INT PRIMARY KEY, " +
            "NOMBRE varchar(100) NOT NULL," +
            "TIPO varchar(100) NOT NULL" +
            ")";

    private static final String SQL_INSERT1 = "INSERT INTO ANIMALES (ID,NOMBRE,TIPO) " +
            "VALUES(1,'Luna','Gato')";
    private static final String SQL_INSERT2 = "INSERT INTO ANIMALES (ID,NOMBRE,TIPO) " +
            "VALUES(2,'Grey','Gato')";
    private static final String SQL_INSERT3 = "INSERT INTO ANIMALES (ID,NOMBRE,TIPO) " +
            "VALUES(3,'Peter','Perro')";
    private static final String SQL_INSERT4 = "INSERT INTO ANIMALES (ID,NOMBRE,TIPO) " +
            "VALUES(4,'Loky','Caballo')";
    private static final String SQL_INSERT5 = "INSERT INTO ANIMALES (ID,NOMBRE,TIPO) " +
            "VALUES(5,'Roberto','Loro')";

    private static final String DELETE = "DELETE FROM ANIMALES WHERE ID=2";

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
            statement4.execute(SQL_INSERT4);

            Statement statement5 = connection.createStatement();
            statement5.execute(SQL_INSERT5);

            verAnimales(connection);

            Statement statement6 = connection.createStatement();
            statement6.execute(DELETE);

            verAnimales(connection);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }

    public static void verAnimales(Connection connection) throws SQLException{
        String sql = "SELECT * FROM ANIMALES";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","","");
    }

}

