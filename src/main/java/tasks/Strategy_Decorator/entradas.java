package tasks.Strategy_Decorator;

import java.util.Scanner;

public class entradas {
    Scanner in=new Scanner(System.in);

    public String opciones(){
        System.out.println("Elija una opcion: ");
        String opcion=in.nextLine();
        return opcion;

    }
}
