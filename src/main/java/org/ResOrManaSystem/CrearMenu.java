package org.ResOrManaSystem;

public class CrearMenu {
    Menu menu = new Menu();
    public Menu agregarMenu(){
        menu.agregarMenu("Hamburguesa", 5.00);
        menu.agregarMenu("Papas Fritas", 2.00);
        menu.agregarMenu("Refresco", 1.00);
        menu.agregarMenu("Ensalada", 3.00);
        menu.agregarMenu("Pollo", 4.00);
        menu.agregarMenu("Pescado", 6.00);
        menu.agregarMenu("Cerveza", 2.00);
        menu.agregarMenu("Vino", 3.00);
        menu.agregarMenu("Agua", 1.00);
        menu.mostrarMenu();

        return menu;
    }
}
