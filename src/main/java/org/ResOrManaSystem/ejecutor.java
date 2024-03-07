package org.ResOrManaSystem;

import java.util.Scanner;

public class ejecutor {
CrearMenu crearmenu = new CrearMenu();
Menu menu1 ;
Scanner in=new Scanner(System.in);

    public void ejecutar(String opcion){
        switch (opcion) {
            case "1":
                System.out.println("menu");
                menu1=crearmenu.agregarMenu();
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
                //muestra el menu actualizado
                menu1.mostrarMenu();
                break;
            case "4":
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

}
