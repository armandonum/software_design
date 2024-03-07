package tasks.paginacion_2.comandos;

import tasks.paginacion_2.interfaces.IComando;
import tasks.paginacion_2.interfaces.IPaginador;

public class ComandoDisplay<T> implements IComando<String> {
    @Override
    public void Ejecutar(IPaginador<String> paginador) {
        paginador.displayPage(paginador.getcurrentPage() );
    }
}
