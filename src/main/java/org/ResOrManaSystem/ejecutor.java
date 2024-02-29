package org.ResOrManaSystem;

import java.util.Scanner;

public class ejecutor {
CrearMenu crearmenu = new CrearMenu();
Menu menu1 = new Menu();
Scanner in=new Scanner(System.in);

    public void ejecutar(String opcion){
        switch (opcion) {
            case "1":
                System.out.println("menu");
                crearmenu.agregarMenu();
                break;
            case "2":
                System.out.println("actualizar precio");
                System.out.println("Ingrese el nombre del producto y el nuevo precio");
                String item = in.nextLine();
                double precio = in.nextDouble();
                menu1.actualizarPrecio(item, precio);
                menu1.mostrarMenu();
                break;
            case "3":
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

}
