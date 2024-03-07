package tasks.paginacion_2.interfaces;


import java.util.HashMap;


public interface IEjecutorComandos <T>{
    void Ejecutar(String comando, IPaginador<T> paginador);
    void Adicionar(String token, IComando cmd);
    void SetComandoInvalido(IComando cmd);
    HashMap<String, IComando> getComandos();
}
