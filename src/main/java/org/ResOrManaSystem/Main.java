package org.ResOrManaSystem;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
//        Menu menu = new Menu();
//        // agrega dos comidas
//        menu.agregarMenu("Hamburguesa", 5.0);
//        menu.agregarMenu("Pizza", 4.0);
//       int opcion = 0;
//       Scanner in = new Scanner(System.in);
//        System.out.println("1. Actualizar precio");
//        System.out.println("2. Salir");
//        opcion = in.nextInt();
//        do{
//        switch (opcion)
//        {
//            case 1:
//                System.out.println("Ingrese el nombre del producto y el nuevo precio");
//                Scanner sc = new Scanner(System.in);
//                String item = sc.nextLine();
//                double precio = sc.nextDouble();
//                menu.actualizarPrecio(item, precio);
//                menu.mostrarMenu();
//                break;
//            case 2:
//                // actualizar
//                System.out.println("actualizar precio");
//                System.out.println("Ingrese el nombre del producto y el nuevo precio");
//                String item1 = in.nextLine();
//                double precio1 = in.nextDouble();
//                menu.actualizarPrecio(item1, precio1);
//                break;
//            case 3:
//                System.out.println("Salir");
//                break;
//            default:
//                System.out.println("Opcion no valida");
//                break;
//        }
//        menu.mostrarMenu();
//        }while(opcion != 3);
        ejecutor ejecutor = new ejecutor();
        Scanner sc = new Scanner(System.in);


        while(true){
            String opcion = sc.nextLine();
            ejecutor.ejecutar(opcion);
        }


    }
}
