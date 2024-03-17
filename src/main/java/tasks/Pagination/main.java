package tasks.Pagination;

import java.util.Scanner;

import tasks.Pagination.interfaces.IEjecutorComandos;
import tasks.Pagination.interfaces.IPaginador;


public class main {
    public static void  main(String[] args) {
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        IEjecutorComandos<String> ejecutor= Fabrica_Comandos.<String>get();
        IPaginador<String> paginador=new Paginador<>(3);

        while(true)
        {
            String cmd = s.nextLine();
            ejecutor.Ejecutar(cmd, paginador);
        }
    }
}
