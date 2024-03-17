package tasks.Pagination.comandos;

import tasks.Pagination.interfaces.IComando;
import tasks.Pagination.interfaces.IPaginador;

public class ComandoPrev<T> implements IComando<String>{

    @Override
    public void Ejecutar(IPaginador<String> paginador) {
        paginador.previousPage();
    }
}
