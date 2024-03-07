package tasks.paginacion_2;
import tasks.paginacion_2.comandos.*;
import tasks.paginacion_2.interfaces.*;
import tasks.paginacion_2.comandos.*;
import tasks.paginacion_2.interfaces.IEjecutorComandos;


public class Fabrica_Comandos {
    public static IEjecutorComandos<String> get() {
        IEjecutorComandos ejecutor = new EjecutorComandos<String>();
        ejecutor.SetComandoInvalido(new ComandoInvalido<String>());
        ejecutor.Adicionar("salir", new ComandoSalir<String>());
        ejecutor.Adicionar("add", new ComandoAdicionar());
        ejecutor.Adicionar("prev", new ComandoPrev<String>());
        ejecutor.Adicionar("display", new ComandoDisplay<String>());
        ejecutor.Adicionar("first", new ComandoFirst<String>());
        ejecutor.Adicionar("last", new ComandoLast<String>());
        ejecutor.Adicionar("next", new ComandoNext<String>());
        ejecutor.Adicionar("goto", new ComandoGoto<String>());
        ejecutor.Adicionar("help", new ComandoAyuda(ejecutor));
        System.out.println("add, first , display, last, next, prev, goto");
        return ejecutor;
    }

}
