package tasks.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.agregarMenu("Pizza", new PrecioFijoMenuItem("Pizza", 10.99));
        menu.agregarMenu("Burger", new PrecioFijoMenuItem("Burger", 8.99));
        menu.agregarMenu("Salad", new PrecioFijoMenuItem("Salad", 5.99));

        gestionMessa gestionMessa = new gestionMessa(5);
        gestionOrden orderManager = new gestionOrden();
        Mesa table1 = gestionMessa.getMesa(1);
        table1.ocupar();
        Orden order1 = table1.getOrder();
        order1.addObserver(() -> {
            System.out.println("Order updated for Table " + table1.getTableNumber() + ":");
            for (IMenu item : order1.getItems()) {
                System.out.println("- " + item.getName() + " $" + item.getPrice());
            }
        });
        order1.agregarItem(menu.getItem("Pizza"));
        order1.agregarItem(menu.getItem("Salad"));
        gestionMessa.mostrarMesas();
    }
}

interface observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}


interface Observer {
    void update();
}


interface IMenu {
    String getName();

    double getPrice();
}

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
//clase mesa
class Mesa {
    private int numeroMesa;
    private boolean ocupada;
    private Orden orden;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.ocupada = false;
        this.orden = new Orden();
    }
    public int getTableNumber() {
        return numeroMesa;
    }

    public boolean ocupado() {
        return ocupada;
    }
    public Orden getOrder() {
        return orden;
    }
    public void ocupar() {
        ocupada = true;
    }
    public void vacante() {
        ocupada = false;
        orden = new Orden();

    }



}


class gestionMessa {
    private List<Mesa> mesas;

    public gestionMessa(int numeroMesas) {
        mesas = new ArrayList<>();
        for (int i = 0; i < numeroMesas; i++) {
            mesas.add(new Mesa(i));
        }


    }

    public Mesa getMesa(int numeroMesa) {
        for (Mesa mesa : mesas) {
            if (mesa.getTableNumber() == numeroMesa) {
                return mesa;
            }
        }
        return null;
    }
    public void mostrarMesas(){
        System.out.println("estado de Mesas:");
        for(Mesa mesa:mesas){
            String estado=mesa.ocupado()?"ocupada":"vacante";
            System.out.println("Mesa "+mesa.getTableNumber()+" "+estado);
        }
    }
}
class gestionOrden {
    private List<Orden> ordenes;

    public gestionOrden() {
        this.ordenes = new ArrayList<>();
    }

    public void realizarOrden(Orden orden) {
        ordenes.add(orden);
    }

    public void completarOrden(Orden orden) {
        ordenes.remove(orden);
    }
}


class PrecioFijoMenuItem implements IMenu{
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



