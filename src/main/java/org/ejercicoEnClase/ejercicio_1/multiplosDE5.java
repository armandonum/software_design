package org.ejercicoEnClase.ejercicio_1;

import java.util.List;

public class multiplosDE5 {

    public void multiplosDe5(List<Integer> arr){
        System.out.println(" numeros multiplos de 5: ");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 5 == 0) {
                System.out.print(arr.get(i)+" , ");
            }
        }

    }
}
