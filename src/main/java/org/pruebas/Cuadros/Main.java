package org.pruebas.Cuadros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        char[][] matriz = main.leerMatriz();
        main.mostrarMatriz(matriz);
        main.mostrarTamaño(matriz);
    }

    public char[][] leerMatriz() {
        Scanner scanner = new Scanner(System.in);
        char[][] matriz = new char[20][50];

        // Leer cada línea de la matriz
        for (int i = 0; i < 20; i++) {
            String linea = scanner.nextLine();
            for (int j = 0; j < 50; j++) {
                matriz[i][j] = linea.charAt(j);
            }
        }

        scanner.close();
        return matriz;
    }

    public void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 50; j++) {
                if (matriz[i][j] == 'Ъ') {
                    mostrarpocision(i, j);
                }
            }
        }
    }

    public void mostrarTamaño(int z) {
        System.out.println("tamaño : " + z);
    }

    public void mostrarpocision(int i, int j) {
        System.out.println("posicion  X : " + j + "  Posicion y : " + i);
    }

    public void mostrarTamaño(char[][] matriz) {
        for (int i = 0; i < 20; i++) {
            boolean dentroSecuencia = false;
            int longitudSecuencia = 0;
            for (int j = 0; j < 50; j++) {
                if (matriz[i][j] == 'Ъ') {
                    dentroSecuencia = true; // Comienza la secuencia
                    longitudSecuencia++;
                } else if ((dentroSecuencia && matriz[i][j] == 'ї') || (dentroSecuencia && matriz[i][j] == 'і')) {
                    dentroSecuencia = false; // Finaliza la secuencia
                    mostrarTamaño(longitudSecuencia); // Muestra la longitud de la secuencia
                    longitudSecuencia = 0; // Reinicia la longitud para la siguiente secuencia
                } else if (dentroSecuencia) {
                    longitudSecuencia++; // Incrementa la longitud de la secuencia
                }
            }
        }
    }
}