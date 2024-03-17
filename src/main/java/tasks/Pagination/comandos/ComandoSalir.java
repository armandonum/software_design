package tasks.Pagination.comandos;
import tasks.Pagination.interfaces.IComando;
import tasks.Pagination.interfaces.IPaginador;

public class ComandoSalir <T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.exit(0);
    }
}
