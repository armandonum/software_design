package tasks.Pagination;
import tasks.Pagination.interfaces.IComando;
import tasks.Pagination.interfaces.IEjecutorComandos;
import tasks.Pagination.interfaces.IPaginador;


import java.util.HashMap;

public class EjecutorComandos<T> implements IEjecutorComandos<T> {

    private HashMap<String, IComando> comandos = new HashMap<String, IComando>();
    private IComando comandoInvalido;

    public void Adicionar(String token, IComando cmd)
    {
        comandos.put(token, cmd);
    }

    public HashMap<String, IComando> getComandos()
    {
        return comandos;
    }

    public void Ejecutar(String cmd, IPaginador<T> paginador)
    {
        if(comandos.containsKey(cmd))
        {
            comandos.get(cmd).Ejecutar(paginador);
        }
        else
        {
            comandoInvalido.Ejecutar(paginador);
        }
    }

    public void SetComandoInvalido(IComando cmd)
    {
        comandoInvalido = cmd;
    }
}
