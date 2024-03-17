package tasks.Pagination.comandos;
import tasks.Pagination.interfaces.IComando;
import tasks.Pagination.interfaces.IPaginador;

public class ComandoGoto<T> implements IComando {
    @Override
    public void Ejecutar(IPaginador paginador) {
        paginador.pageByNumber();
    }
}
