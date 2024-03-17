package tasks.Pagination.comandos;

import tasks.Pagination.interfaces.IComando;
import tasks.Pagination.interfaces.IPaginador;

public class ComandoInvalido <T> implements IComando<T> {
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.out.println("Comando invalido");
    }
}
