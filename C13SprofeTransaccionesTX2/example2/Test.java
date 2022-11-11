package a.com.example2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.sql.*;

public class Test {

    private static final Logger logger = Logger.getLogger(Test.class);

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS CUENTA; CREATE TABLE CUENTA "
                                                    + "("
                                                    + " ID INT PRIMARY KEY,"
                                                    + " NOMBRE varchar(100) NOT NULL, "
                                                    + " NRO_CUENTA NUMERIC(10, 2) NOT NULL,"
                                                    + " SALDO INT NOT NULL"
                                                    + " )";

    private static final String SQL_INSERT =  "INSERT INTO CUENTA (ID, NOMBRE, NRO_CUENTA, SALDO) VALUES (?,?,?,?)";

    private static final String SQL_UPDATE =  "UPDATE CUENTA SET SALDO=? WHERE ID=?";

    public static void main(String[] args) throws Exception {

        Cuenta cuenta = new Cuenta(12, "Sueldo", 10);

        Cuenta cuenta2 = new Cuenta(123, "Sueldo", 10232);

        Connection connection = null;

        try {

            File log4jfile = new File("./src/log4j/config/log4j.properties");
            PropertyConfigurator.configure(log4jfile.getAbsolutePath());


            logger.info("conectando");

            connection= getConnection();

            logger.info("Conexion exitosa");

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            logger.info("Tabla Creada");

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1, 1);
            psInsert.setString(2, cuenta.getNombre());
            psInsert.setInt(3, cuenta.getNroCuenta());
            psInsert.setDouble(4, cuenta.getSaldo());

            logger.info("Insert correcto");

            psInsert.execute();

            psInsert.setInt(1, 2);
            psInsert.setString(2, cuenta2.getNombre());
            psInsert.setInt(3, cuenta2.getNroCuenta());
            psInsert.setDouble(4, cuenta2.getSaldo());

            logger.info("Insert2 correcto");

            psInsert.execute();

            PreparedStatement psUpdate1 = connection.prepareStatement(SQL_UPDATE);
            psUpdate1.setDouble(1, cuenta.getSaldo() + 10);
            psUpdate1.setInt(2, 1);
            psUpdate1.execute();

            logger.info("Update correcto");

            connection.setAutoCommit(false);

            PreparedStatement psUpdate2 = connection.prepareStatement(SQL_UPDATE);
            psUpdate2.setDouble(1, cuenta.getSaldo() + 15);
            psUpdate2.setInt(2, 1);
            psUpdate2.execute();

            logger.info("update 2 correcto");

            int a = 4 / 0;

            logger.info("exception correcto");

            connection.commit();

            connection.setAutoCommit(true);

            String sql = "SELECT * FROM CUENTA";
            Statement sqlSelect = connection.createStatement();
            ResultSet rs = sqlSelect.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +rs.getString(2) + rs.getInt(3) + rs.getString(4));
            }

        } catch (Exception e) {
            connection.rollback();
        } finally {
            connection.close();
        }

        Connection connection2= getConnection();
        String sql = "SELECT * FROM CUENTA";
        Statement sqlSmt = connection2.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + rs.getString(2) + rs.getInt(3) + rs.getString(4));
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }
}