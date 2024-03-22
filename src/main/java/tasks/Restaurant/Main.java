package tasks.Restaurant;


import tasks.Restaurant.interfaces.IMenu;
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.agregarMenu("Pizza", new PrecioFijoMenuItem("Pizza", 10.99));
        menu.agregarMenu("Burger", new PrecioFijoMenuItem("Burger", 8.99));
        menu.agregarMenu("Salad", new PrecioFijoMenuItem("Salad", 5.99));

        gestionMessa gestionMessa = new gestionMessa(5);
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
