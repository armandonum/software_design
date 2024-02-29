package org.restaurantSystem;

public interface IResturant {

    void addmenuItem(String nombre,double precio);
    void actualizarPrecio(String nombre,double newPrecio);
    // tomar orden
void tomarOrden(String mesaNumero, String nombre, String notas);

void estadoOrden();

void estadoMesa();

void oreden_completada(int ordenNumero);

void generar_factura(String mesaNumero);


    
}
