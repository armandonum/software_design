package org.paginacion_2.comandos;
import org.paginacion_2.interfaces.IComando;
import org.paginacion_2.interfaces.IPaginador;

public class ComandoFirst<T> implements IComando {
    @Override
    public void Ejecutar(IPaginador paginador) {
paginador.firstPage();
    }
}
