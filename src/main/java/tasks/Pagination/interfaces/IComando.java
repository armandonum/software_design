package tasks.Pagination.interfaces;

public interface IComando <T>{
    void Ejecutar(IPaginador<T> paginador);
}
