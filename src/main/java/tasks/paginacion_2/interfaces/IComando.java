package tasks.paginacion_2.interfaces;

public interface IComando <T>{
    void Ejecutar(IPaginador<T> paginador);
}
