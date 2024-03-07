package tasks.paginacion_2.comandos;
import tasks.paginacion_2.interfaces.IComando;
import tasks.paginacion_2.interfaces.IPaginador;

public class ComandoNext<T> implements IComando {
    @Override
    public void Ejecutar(IPaginador paginador) {
          paginador.nextPage();
    }
}