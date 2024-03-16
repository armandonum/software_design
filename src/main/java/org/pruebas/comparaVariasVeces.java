package org.pruebas;

import org.pruebas.Decorato;
import tasks.sortListObjets.compararGrado;
import tasks.sortListObjets.compararNombre;
import tasks.sortListObjets.compararaEdad;
import tasks.sortListObjets.estudiante;
import tasks.sortListObjets.interfaces.IComparatorStrategy;

public class comparaVariasVeces extends Decorato {
    public comparaVariasVeces(IComparatorStrategy comparador) {
        super(comparador);
    }
    @Override
    public int compare(estudiante s1, estudiante s2) {
        int resultado=comparador.compare(s1, s2);
        if(resultado==0){
            resultado= new compararNombre().compare(s1, s2);
            if(resultado==0){
                resultado= new compararaEdad().compare(s1, s2);
                if (resultado == 0) {
                    resultado= new compararGrado().compare(s1, s2);
                }
            }
        }
    return resultado;
    }
}
