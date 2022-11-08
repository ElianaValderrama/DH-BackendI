package interfaces.daos.impl;

import interfaces.daos.IDao;
import models.Odontologo;
import org.apache.log4j.Logger;


import java.sql.*;

public class IDaoImpl implements IDao<Odontologo> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";

    public static final Logger myLogger = Logger.getLogger(IDaoImpl.class);

    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS ODONTOLOGOS; CREATE TABLE ODONTOLOGOS " +
            "(" +
            "MATRICULA INT PRIMARY KEY, " +
            "NOMBRE varchar(100) NOT NULL," +
            "APELLIDO varchar(100) NOT NULL" +
            ")";

    private static final String SQL_SELECT_WITH_MATRICULA = "SELECT * FROM ODONTOLOGOS WHERE MATRICULA=?";

    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS(matricula,nombre,apellido) VALUES(?,?,?)";

    public IDaoImpl() {
        Connection connection;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            myLogger.info("Se ejecuta creación de la base de datos");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;

        try{
            connection = getConnection();


            PreparedStatement preparedStatementInsert = connection.prepareStatement(SQL_INSERT);
            preparedStatementInsert.setInt(1 , odontologo.getMatricula());
            preparedStatementInsert.setString(2, odontologo.getNombre());
            preparedStatementInsert.setString(3, odontologo.getApellido());

            preparedStatementInsert.executeUpdate();
            preparedStatementInsert.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        myLogger.info("Se guardo odontologo");
        return odontologo;
    }

    @Override
    public Odontologo buscar(Integer matricula) {
        Connection connection;
        Odontologo odontologo = null;

        try{
            connection = getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_WITH_MATRICULA);
            preparedStatement.setInt(1,matricula);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                Integer matriculaOdont = result.getInt("MATRICULA");
                String nombre = result.getString("NOMBRE");
                String apellido = result.getString("APELLIDO");
                odontologo = new Odontologo(matriculaOdont,nombre,apellido);
            }

            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return odontologo;
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","","");
    }
}
