package org.drones_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leerEntradasLocations {
    public static List<String[]> leerEntradasLocations(Scanner in) {
        List<String[]> locations = new ArrayList<>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isEmpty()) {
                break;
            }
            locations.add(line.split(", "));
        }
        return locations;

    }
}
