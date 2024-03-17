package tasks.Pagination.interfaces;


import java.util.HashMap;


public interface IEjecutorComandos <T>{
    void Ejecutar(String comando, IPaginador<T> paginador);
    void Adicionar(String token, IComando cmd);
    void SetComandoInvalido(IComando cmd);
    HashMap<String, IComando> getComandos();
}
