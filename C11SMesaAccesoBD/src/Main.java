import java.sql.*;

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS FIGURAS; CREATE TABLE FIGURAS " +
            "(" +
            "ID INT PRIMARY KEY, " +
            "TIPO_FIGURA varchar(100) NOT NULL," +
            "COLOR varchar(100) NOT NULL" +
            ")";

    private static final String SQL_INSERT1 = "INSERT INTO FIGURAS (ID,TIPO_FIGURA,COLOR) " +
            "VALUES(1,'Círculo','rojo')";

    private static final String SQL_INSERT2 = "INSERT INTO FIGURAS (ID,TIPO_FIGURA,COLOR) " +
            "VALUES(2,'Círculo','azúl')";

    private static final String SQL_INSERT3 = "INSERT INTO FIGURAS (ID,TIPO_FIGURA,COLOR) " +
            "VALUES(3,'Cuadrado','verde')";

    private static final String SQL_INSERT4 = "INSERT INTO FIGURAS (ID,TIPO_FIGURA,COLOR) " +
            "VALUES(4,'Cuadrado','morado')";

    private static final String SQL_INSERT5 = "INSERT INTO FIGURAS (ID,TIPO_FIGURA,COLOR) " +
            "VALUES(5,'Cuadrado','negro')";

    private static final String SQL_SELECT1 = "SELECT * FROM FIGURAS WHERE TIPO_FIGURA='Círculo' AND " +
            "COLOR='rojo'";

    public static void main(String[] args) throws Exception{
        //System.out.println("Hello world!");
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

            verFiguras(connection);

            System.out.println("El circulo rojo encontrado es: ");
            Statement statement6 = connection.createStatement();
            statement6.execute(SQL_SELECT1);
            ResultSet rs = statement.executeQuery(SQL_SELECT1);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }

    public static void verFiguras(Connection connection) throws SQLException {
        String sql = "SELECT * FROM FIGURAS";
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