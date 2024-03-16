package org.ejercicoEnClase.Square_Frames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ObtenerTamañoDeCuadros obtenertamaño = new ObtenerTamañoDeCuadros();
        Leer_Cuadros leerCuadros = new Leer_Cuadros();
        cantidad_Cuadros cuadros = new cantidad_Cuadros();
        char[][] matriz = leerCuadros.leer();
        cuadros.contar(matriz);

        obtenertamaño.mostrarTamaño(matriz);

    }






}