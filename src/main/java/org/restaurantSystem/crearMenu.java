package org.restaurantSystem;
import java.util.Map;
import java.util.HashMap;

public class crearMenu {

    private Map<String, Double> menu;

    public crearMenu() {
        this.menu = new HashMap<>();

        menu.put("Hamburguesa", 10.99);
        menu.put("Pizza", 12.50);
        menu.put("Ensalada", 8.75);
        menu.put("Refresco", 2.50);
        menu.put("Café", 1.99);
    }
}
