package org.ejercicoEnClase.Square_Frames;

public class cantidad_Cuadros {
    int numeroCuadras = 0;
    public void contar(char[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 50; j++) {
                if (matriz[i][j] == '┌') {
                    numeroCuadras++;
                    System.out.println();
                }
            }
        }
        System.out.println(": "+numeroCuadras);
    }
}
