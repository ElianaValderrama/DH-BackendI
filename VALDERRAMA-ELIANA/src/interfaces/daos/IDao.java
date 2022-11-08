package interfaces.daos;

public interface IDao <T> {

    T guardar(T t);
    T buscar(Integer id);

}
