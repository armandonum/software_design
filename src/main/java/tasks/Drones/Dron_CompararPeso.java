package tasks.Drones;

import java.util.Comparator;

public class Dron_CompararPeso implements Comparator<Dron> {
    @Override
    public int compare(Dron dron1, Dron dron2) {
        return Integer.compare(dron1.getPesoActual(), dron2.getPesoActual());
    }
}
