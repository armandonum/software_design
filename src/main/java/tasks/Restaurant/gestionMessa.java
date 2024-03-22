package tasks.Restaurant;


import java.util.ArrayList;
import java.util.List;

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

    public void mostrarMesas() {
        System.out.println("estado de Mesas:");
        for (Mesa mesa : mesas) {
            String estado = mesa.ocupado() ? "ocupada" : "vacante";
            System.out.println("Mesa " + mesa.getTableNumber() + " " + estado);
        }
    }
}
