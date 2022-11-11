import org.apache.log4j.Logger;
import java.sql.*;
public class Odontologo {

    public static final Logger myLogger = Logger.getLogger(Odontologo.class);

    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS ODONTOLOGOS; CREATE TABLE ODONTOLOGOS " +
            "(" +
            "ID INT PRIMARY KEY, " +
            "NOMBRE varchar(100) NOT NULL," +
            "APELLIDO varchar(100) NOT NULL," +
            "MATRICULA varchar(100) NOT NULL" +
            ")";

    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS (ID,NOMBRE,APELLIDO,MATRICULA) " +
            "VALUES(?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE ODONTOLOGOS SET NOMBRE=? WHERE ID=?";

    private static final String SQL_SELECT = "SELECT * FROM ODONTOLOGOS";

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try{
            connection = getConnection();


            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(SQL_INSERT);
            preparedStatementInsert.setInt(1 ,1);
            preparedStatementInsert.setString(2, "Elva");
            preparedStatementInsert.setString(3, "Ginón");
            preparedStatementInsert.setString(4, "zxcvzxcv");
            preparedStatementInsert.execute();

            ResultSet rs = statement.executeQuery(SQL_SELECT);
            myLogger.info("Se guardó a: ");
            while(rs.next()){
                myLogger.info(rs.getInt(1)+" "+rs.getString(2)+" "
                        +rs.getString(3) + " " + rs.getString(4));
            }

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(SQL_UPDATE);
            preparedStatementUpdate.setString(1, "Once");
            preparedStatementUpdate.setInt(2, 1);
            preparedStatementUpdate.execute();

            ResultSet rs2 = statement.executeQuery(SQL_SELECT);
            myLogger.info("Se Actualizó a: ");
            while(rs2.next()){
                myLogger.info(rs2.getInt(1)+" "+rs2.getString(2)+" "
                        +rs2.getString(3) + " " + rs2.getString(4));
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","","");
    }


}
