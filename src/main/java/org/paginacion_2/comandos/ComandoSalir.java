package org.paginacion_2.comandos;
import org.paginacion_2.interfaces.*;

public class ComandoSalir <T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.exit(0);
    }
}
