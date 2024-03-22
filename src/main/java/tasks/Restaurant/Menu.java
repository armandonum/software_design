package tasks.Restaurant;

import tasks.Restaurant.interfaces.IMenu;

import java.util.HashMap;
import java.util.Map;

class Menu {
    private Map<String, IMenu> items;

    public Menu() {
        this.items = new HashMap<>();
    }

    public void agregarMenu(String nombre, IMenu item) {
        items.put(nombre, item);
    }

    public void eliminarMenu(String nombre) {
        items.remove(nombre);
    }

    public IMenu getItem(String nombre) {
        return items.get(nombre);
    }

    public void mostrarMenu() {
        System.out.println("Menu:");
        for (Map.Entry<String, IMenu> entry : items.entrySet()) {
            IMenu item = entry.getValue();
            System.out.println(item.getName() + " precio: " + item.getPrice());
        }
    }
}
