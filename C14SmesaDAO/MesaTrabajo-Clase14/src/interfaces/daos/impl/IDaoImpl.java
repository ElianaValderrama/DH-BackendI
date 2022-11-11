package interfaces.daos.impl;

import interfaces.daos.IDao;
import models.Medicamento;
import org.apache.log4j.Logger;

import java.sql.*;

public class IDaoImpl implements IDao<Medicamento> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";

    public static final Logger myLogger = Logger.getLogger(IDaoImpl.class);

    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS MEDICAMENTOS; CREATE TABLE MEDICAMENTOS " +
            "(" +
            "ID INT auto_increment PRIMARY KEY, " +
            "NOMBRE varchar(100) NOT NULL," +
            "LABORATORIO varchar(100) NOT NULL," +
            "CANTIDAD INT NOT NULL," +
            "PRECIO double NOT NULL" +
            ")";

    private static final String SQL_SELECT_WITH_ID = "SELECT * FROM MEDICAMENTOS WHERE ID=?";

    private static final String SQL_SELECT_WITH_CANTIDAD = "SELECT * FROM MEDICAMENTOS WHERE CANTIDAD=?";

    private static final String SQL_INSERT = "INSERT INTO MEDICAMENTOS(nombre,laboratorio,cantidad,precio) VALUES(?,?,?,?)";

    public IDaoImpl() {
        Connection connection;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        Connection connection = null;

        try{
            connection = getConnection();


            PreparedStatement preparedStatementInsert = connection.prepareStatement(SQL_INSERT);
            preparedStatementInsert.setString(1 , medicamento.getNombre());
            preparedStatementInsert.setString(2, medicamento.getLaboratorio());
            preparedStatementInsert.setInt(3, medicamento.getCantidad());
            preparedStatementInsert.setDouble(4, medicamento.getPrecio());

            preparedStatementInsert.executeUpdate();
            preparedStatementInsert.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {
        Connection connection;
        Medicamento medicamento = null;

        try{
            connection = getConnection();

//            Statement statement = connection.createStatement();
//            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_WITH_ID);
            preparedStatement.setInt(1,id);

            //3 Ejecutar una sentencia SQL
            ResultSet result = preparedStatement.executeQuery();

            //4 Obtener resultados
            while (result.next()) {
                Integer idMedicamento = result.getInt("ID");
                String nombre = result.getString("NOMBRE");
                String laboratorio = result.getString("LABORATORIO");
                Integer cantidad = result.getInt("CANTIDAD");
                Double precio = result.getDouble("PRECIO");
                medicamento = new Medicamento(idMedicamento,nombre,laboratorio,cantidad,precio);
            }

            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscarPorCantidad(Integer cantidad) {
        Connection connection;
        Medicamento medicamento = null;

        try{
            connection = getConnection();


            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_WITH_CANTIDAD);
            preparedStatement.setInt(1,cantidad);

            //3 Ejecutar una sentencia SQL
            ResultSet result = preparedStatement.executeQuery();

            //4 Obtener resultados
            while (result.next()) {
                int idMedicamento = result.getInt("ID");
                String nombre = result.getString("NOMBRE");
                String laboratorio = result.getString("LABORATORIO");
                Integer cantidadABuscar = result.getInt("CANTIDAD");
                Double precio = result.getDouble("PRECIO");
                medicamento = new Medicamento(idMedicamento,nombre,laboratorio,cantidadABuscar,precio);
            }
            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","","");
    }
}
