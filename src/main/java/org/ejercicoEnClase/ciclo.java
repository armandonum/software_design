package org.ejercicoEnClase;

import java.util.List;

public class ciclo {

    public List<Integer> ciclo(List<Integer> arr, int dato) {
        System.out.println(" numeros multiplos de");
        for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) % 2 == dato) {
                    System.out.print(arr.get(i) + " , ");
                }

            }


        return arr;
    }
}
