package ClinicaOdontologica.Dao;

import java.util.List;

public interface IDao <T>{

    public T guardar(T t);

    public T buscar(Long id);

    public void eliminar(Long id);

    public List<T> buscarTodos();

}
