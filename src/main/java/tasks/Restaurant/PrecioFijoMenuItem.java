package tasks.Restaurant;


import tasks.Restaurant.interfaces.IMenu;

public class PrecioFijoMenuItem implements IMenu {
    private String nombre;
    private double precio;
    public PrecioFijoMenuItem(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public double getPrice() {
        return precio;
    }
}
