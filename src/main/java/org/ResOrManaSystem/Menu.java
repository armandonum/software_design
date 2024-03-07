package org.ResOrManaSystem;

import org.ResOrManaSystem.interfaces.IMenu;

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
        System.out.println("el metodo se esta ejecutanco ");
       for(int i=0;i<menu.size();i++){
           System.out.println("el for sirve");
           System.out.println(menu.keySet().toArray()[i]+" precio "+menu.values().toArray()[i]);
       }


    }
}
