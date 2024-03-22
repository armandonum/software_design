package tasks.sortListObjets;

import java.util.Scanner;

public class entradas {
    Scanner in=new Scanner(System.in);

    public String opciones(){
        Menu();
        System.out.println("Elija una opcion: ");
        String opcion=in.nextLine();
        return opcion;
    }

    private static void Menu() {
        System.out.println("edad ");
        System.out.println("grado ");
        System.out.println("nombre ");
        System.out.println("combinado ");
    }
}
