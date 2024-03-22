package tasks.Restaurant;



import java.util.ArrayList;
import java.util.List;

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
