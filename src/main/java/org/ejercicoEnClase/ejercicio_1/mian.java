package org.ejercicoEnClase.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class mian {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        generanum generanum = new generanum();
        items=generanum.generarNumeros();
        System.out.println(" numeros pares: ");
        ciclo ciclo=new ciclo();

        ciclo.ciclo(items,0);
        System.out.println(" numeros impares: ");
        ciclo.ciclo(items,1);

    }
}
