package org.drones_2;

import java.util.List;

public class mostrarEntrega implements IEntrega{
    @Override
    public void mostrarEntrega(List<Dron> drones, List<String[]> locations) {
        for (Dron drone : drones) {
            System.out.println(drone.getNombre());
        }
        for(int i=0; i<drones.size(); i++){
            Dron drone = drones.get(i);
            System.out.println(drone.getNombre());
            int tripNumber = 1;
            for (int j = 0; j < locations.size(); j++) {
                if (drone.puedeCargar(Integer.parseInt(locations.get(j)[1]))) {
                    System.out.println("Trip #" + tripNumber++);
                    System.out.println(locations.get(j)[0]);
                    drone.cargar(Integer.parseInt(locations.get(j)[1]));
                }
            }
        }

    }
}
