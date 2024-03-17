package tasks.Pagination.comandos;

import tasks.Pagination.interfaces.IComando;
import tasks.Pagination.interfaces.IPaginador;

import java.util.Scanner;

public class ComandoAdicionar  implements IComando<String> {
    public void Ejecutar(IPaginador<String> paginador)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese dato");
        String cadena = s.nextLine();
        paginador.addItem(cadena);
    }
}
