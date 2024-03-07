package org.ResOrManaSystem.interfaces;

public interface IMenu {

    void agregarMenu( String item, double precio);

    void actualizarPrecio(String item, double precio);
    void mostrarMenu();
}
