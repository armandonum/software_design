package tasks.sortListObjets;

import java.util.Scanner;

public class entradas {
    Scanner in=new Scanner(System.in);

    public String opciones(){
        System.out.println("Elija una opcion: ");
        String opcion=in.nextLine();
        return opcion;
//        switch (opcion){
//            case "nombre":
//                return "nombre";
//            case "grado":
//                return "grado";
//            case "edad":
//                return "edad";
//            case "combinado":
//                return "combinado";
//            default:
//                return "opcion no valida";
//        }
    }
}
