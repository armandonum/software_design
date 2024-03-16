package org.ejercicoEnClase.Square_Frames;

import java.util.Scanner;

public class Leer_Cuadros {
    public char[][] leer() {
        Scanner scanner = new Scanner(System.in);
        char[][] matriz = new char[20][50];
        for (int i = 0; i < 20; i++) {
            String linea = scanner.nextLine();
            for (int j = 0; j < 50; j++) {
                matriz[i][j] = linea.charAt(j);
            }
        }
        scanner.close();
        return matriz;
    }
}
