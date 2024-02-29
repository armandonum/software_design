package org.paginacion_2.comandos;

import org.paginacion_2.interfaces.*;

public class ComandoInvalido <T> implements IComando<T>{
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.out.println("Comando invalido");
    }
}
