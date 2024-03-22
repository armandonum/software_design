package tasks.Restaurant;

import tasks.Restaurant.interfaces.IMenu;
import tasks.Restaurant.interfaces.Observer;
import tasks.Restaurant.interfaces.observable;

import java.util.ArrayList;
import java.util.List;

class Orden implements observable {
    // primero el constructor
    private List<IMenu> items;
    private List<Observer> clientes;

    public Orden() {
        this.items = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarItem(IMenu item) {
        items.add(item);
        notifyObserver();
    }

    public void eliminarItem(IMenu item) {
        items.remove(item);
        notifyObserver();
    }

    public List<IMenu> getItems() {
        return items;
    }

    @Override
    public void addObserver(Observer observer) {
        clientes.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        clientes.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : clientes) {
            observer.update();
        }

    }
}
