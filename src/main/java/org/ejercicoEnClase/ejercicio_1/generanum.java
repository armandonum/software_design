package org.ejercicoEnClase.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class generanum {
  public List<Integer> generarNumeros(){
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++) {
        numeros.add((int) (Math.random() * 100));
    }
    System.out.print(numeros+",");

    return numeros;
  }



}
