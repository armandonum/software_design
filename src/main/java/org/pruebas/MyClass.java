package org.pruebas;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MyClass {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        IEjecutorComandos<String> ejecutor= FabricaEjecutorComandos.<String>get();
        IPaginador<String> paginador=new Paginador<>();

        while(true)
        {
            String cmd = s.nextLine();
            ejecutor.Ejecutar(cmd, paginador);
        }
    }
}

class FabricaEjecutorComandos
{
    public static IEjecutorComandos<String> get()
    {
        IEjecutorComandos ejecutor = new EjecutorComandos<String>();
        ejecutor.SetComandoInvalido(new ComandoInvalido<String>());
        ejecutor.Adicionar("salir", new ComandoSalir<String>());
        ejecutor.Adicionar("adicionar", new ComandoAdicionar());
        ejecutor.Adicionar("prev", new ComandoPrev<String>());
        ejecutor.Adicionar("last", new comadoLast<String>());
        ejecutor.Adicionar("help", new ComandoAyuda(ejecutor));

        return ejecutor;
    }

}

interface IPaginador<T>
{ void addItem(T item);

    void firstPage();

    void lastPage();

    void nextPage();

    void previousPage();

    void pageByNumber(int pageNumber);

    int getNumberOfPages();

}

class Paginador<T> implements IPaginador<T>
{
    @Override
    public void addItem(T item) {
    }

    @Override
    public void firstPage() {

    }

    @Override
    public void lastPage() {

    }

    @Override
    public void nextPage() {

    }

    @Override
    public void previousPage() {

    }

    @Override
    public void pageByNumber(int pageNumber) {

    }

    @Override
    public int getNumberOfPages() {
        return 0;
    }
}

interface IEjecutorComandos<T>
{
    void Ejecutar(String comando, IPaginador<T> paginador);
    void Adicionar(String token, IComando cmd);
    void SetComandoInvalido(IComando cmd);
    HashMap<String, IComando> getComandos();
}

class EjecutorComandos<T> implements IEjecutorComandos<T>
{
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

interface IComando<T>
{
    void Ejecutar(IPaginador<T> paginador);
}

class ComandoSalir<T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.exit(0);
    }
}

class ComandoAyuda<T> implements IComando<T>
{
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

class ComandoAdicionar implements IComando<String>
{
    public void Ejecutar(IPaginador<String> paginador)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese dato");
        String cadena = s.nextLine();
        paginador.addItem(cadena);
    }
}

class ComandoInvalido<T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.out.println("Comando invalido");
    }
}

class ComandoPrev<T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        paginador.previousPage();

    }
}
class comadoLast<T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        paginador.lastPage();
    }
}
