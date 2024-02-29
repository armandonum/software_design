package org.ejercicoEnClase;

import java.util.List;

public class printOdd {


    public void numerosImpares(List<Integer> arr){
        System.out.println(" numeros impares: ");
           for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) % 2 == 1) {
                    System.out.print(arr.get(i)+" , ");
                }
            }
    }
}
