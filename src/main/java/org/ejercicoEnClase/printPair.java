package org.ejercicoEnClase;

import java.util.List;

public class printPair {
    generanum generanum = new generanum();
    public void printPair(List<Integer> arr){
        System.out.println(" numeros pares: ");
           for (int i = 0; i < arr.size(); i++) {
               if (arr.get(i) % 2 == 0) {
                   System.out.print(arr.get(i)+" , ");
               }
            }
    }
}
