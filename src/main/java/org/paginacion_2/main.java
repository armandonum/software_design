package org.paginacion_2;

import java.util.Scanner;
import org.paginacion_2.interfaces.*;


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
