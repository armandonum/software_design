package org.ResOrManaSystem;

import java.util.HashMap;
import java.util.Map;

public class Menu implements IMenu {

    private Map<String, Double> menu;

    public Menu(){
        this.menu=new HashMap<>();
    }
    @Override
    public void agregarMenu(String item, double precio) {
        menu.put(item,precio);

    }

    @Override
    public void actualizarPrecio(String item, double precio) {
if(menu.containsKey(item)){
    menu.put(item,precio);

}


    }

    @Override
    public void mostrarMenu() {
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(" " + entry.getKey() + "-> " + entry.getValue());
        }

    }
}
