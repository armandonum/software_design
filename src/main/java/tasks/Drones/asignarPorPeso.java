package tasks.Drones;

import java.util.List;

public class asignarPorPeso implements IStrategyAsignaPaquetes {
    @Override
    public void asignarPaquetes(List<Dron> dron, List<String[]> locations) {
        dron.sort(new Dron_CompararPeso());
        for (String[] location : locations) {
            int weight = Integer.parseInt(location[1]);
            for (Dron drone : dron) {
                if (drone.puedeCargar(weight)) {
                    drone.cargar(weight);
                    break;
                }
            }
        }




    }
}
