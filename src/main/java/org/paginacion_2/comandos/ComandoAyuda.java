package org.paginacion_2.comandos;
import java.util.HashMap;
import java.util.Map;
import org.paginacion_2.interfaces.*;

public class ComandoAyuda<T> implements IComando<T>{
    IEjecutorComandos<T> ejecutor;

    public ComandoAyuda(IEjecutorComandos<T> e)
    {
        ejecutor = e;
    }
    public void Ejecutar(IPaginador<T> paginador)
    {
        HashMap<String, IComando> comandos = ejecutor.getComandos();

        for (Map.Entry<String, IComando> entry : comandos.entrySet())
        {
            System.out.println(entry.getKey());
        }
    }
}
