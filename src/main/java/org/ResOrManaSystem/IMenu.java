package org.ResOrManaSystem;

public interface IMenu {

    void agregarMenu( String item, double precio);

    void actualizarPrecio(String item, double precio);
    void mostrarMenu();
}
