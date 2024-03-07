package org.drones_2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        List<Dron> drones = leerEntradasDrones.leerEntradasDrones(in);
        List<String[]> locations = leerEntradasLocations.leerEntradasLocations(in);

        IStrategyAsignaPaquetes strategy = new asignarPorPeso();
        strategy.asignarPaquetes(drones, locations);

        IEntrega entrega = new mostrarEntrega();
        entrega.mostrarEntrega(drones, locations);


    }
}
