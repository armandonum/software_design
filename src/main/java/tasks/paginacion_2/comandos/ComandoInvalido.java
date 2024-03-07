package tasks.paginacion_2.comandos;

import tasks.paginacion_2.interfaces.*;
import tasks.paginacion_2.interfaces.IComando;
import tasks.paginacion_2.interfaces.IPaginador;

public class ComandoInvalido <T> implements IComando<T> {
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.out.println("Comando invalido");
    }
}
