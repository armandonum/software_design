package tasks.paginacion_2.comandos;
import java.util.HashMap;
import java.util.Map;
import tasks.paginacion_2.interfaces.*;
import tasks.paginacion_2.interfaces.IComando;
import tasks.paginacion_2.interfaces.IEjecutorComandos;
import tasks.paginacion_2.interfaces.IPaginador;

public class ComandoAyuda<T> implements IComando<T> {
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
