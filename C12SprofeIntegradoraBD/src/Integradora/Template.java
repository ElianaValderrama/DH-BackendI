package Integradora;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.sql.*;

public class Template {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS (); CREATE TABLE () "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOT NULL, "
            + " NOT NULL, "
            + " NOT NULL "
            + " )";
    private static final String SQL_INSERT =  "INSERT INTO  () VALUES ()";
    private static final String SQL_DELETE =  "DELETE FROM  WHERE ID=";

    private static final Logger logger = Logger.getLogger(Template.class);

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            File file = new File("./src/Integradora/config/log4j.properties");
            PropertyConfigurator.configure(file.getAbsolutePath());

            connection= getConnection();

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statementIns = connection.createStatement();
            statementIns.execute(SQL_INSERT);

            Statement statementDEl = connection.createStatement();
            statementDEl.execute(SQL_DELETE);


        } catch (Exception e) {

        } finally {
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test");
    }
}