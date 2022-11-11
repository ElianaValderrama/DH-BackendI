package ClinicaOdontologica.Dao;

import ClinicaOdontologica.Model.Domicilio;
import ClinicaOdontologica.Model.Paciente;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaoImpl implements IDao<Paciente>{

    private DomicilioDaoImpl domicilioDao = new DomicilioDaoImpl();

    @Override
    public List<Paciente> buscarTodos() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Paciente> pacientes = new ArrayList<>();

        try{
            connection = getConnection();
            preparedStatement = connection.prepareStatement("Select * from pacientes");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Long idPaciente = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                int dni = resultSet.getInt("dni");
                LocalDate fechaIngreso = resultSet.getDate("fecha_ingreso").toLocalDate();
                Long idDomicilio = resultSet.getLong("domicilio");
                Domicilio domicilio1 = domicilioDao.buscar(idDomicilio);
                Paciente paciente = new Paciente(idPaciente, nombre, apellido, dni, fechaIngreso, domicilio1);
                pacientes.add(paciente);

            }

            preparedStatement.close();

        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return pacientes;
    }

    @Override
    public Paciente guardar(Paciente paciente) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{

            connection = getConnection();

            Domicilio domicilio = domicilioDao.guardar(paciente.getDomicilio());
            paciente.getDomicilio().setId(domicilio.getId());

            preparedStatement = connection.prepareStatement("INSERT INTO pacientes (nombre,apellido,dni,fecha_ingreso,domicilio_id) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1,paciente.getNombre());
            preparedStatement.setString(2,paciente.getApellido());
            preparedStatement.setInt(3,paciente.getDni());
            preparedStatement.setDate(4,Date.valueOf(paciente.getFecha_ingreso()));
            preparedStatement.setLong(5,paciente.getDomicilio().getId());

            preparedStatement.executeUpdate();

            preparedStatement.close();

        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        return paciente;
    }

    @Override
    public Paciente buscar(Long id) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Paciente paciente = null;

        try{

            connection = getConnection();

            preparedStatement = connection.prepareStatement("SELECT * FROM pacientes where id = ?");
            preparedStatement.setLong(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Long idPaciente = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                int dni = resultSet.getInt("dni");
                LocalDate fechaIngreso = resultSet.getDate("fecha_ingreso").toLocalDate();
                Long idDomicilio = resultSet.getLong("domicilio");
                Domicilio domicilio1 = domicilioDao.buscar(idDomicilio);
                paciente = new Paciente(idPaciente, nombre, apellido, dni, fechaIngreso, domicilio1);
            }
            preparedStatement.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = getConnection();

            preparedStatement = connection.prepareStatement("DELETE FROM pacientes where id = ?");
            preparedStatement.setLong(1,id);

            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

}
