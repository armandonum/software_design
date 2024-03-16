package org.ejercicoEnClase.Square_Frames;

public class ObtenerTamañoDeCuadros {
    Mostrar mostrar = new Mostrar();
    public void mostrarTamaño(char[][] matriz) {
        for (int i = 0; i < 20; i++) {
            boolean dentroSecuencia = false;
            int longitudSecuencia = 1;
            for (int j = 0; j < 50; j++) {
                if (matriz[i][j] == '┌') {
                    mostrar.mostrarpocision(i, j);
                    dentroSecuencia = true;
                    longitudSecuencia++;
                } else if ((dentroSecuencia && matriz[i][j] == '┐') || (dentroSecuencia && matriz[i][j] == '│')) {
                    dentroSecuencia = false;
                    mostrar.mostrarTamaño(longitudSecuencia);
                    longitudSecuencia = 1;
                } else if (dentroSecuencia) {
                    longitudSecuencia++; // Incrementa la longitud de la secuencia
                }
            }
        }
    }
}
