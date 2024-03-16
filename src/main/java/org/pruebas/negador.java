package org.pruebas;

import tasks.sortListObjets.estudiante;
import tasks.sortListObjets.interfaces.IComparatorStrategy;

public class negador extends Decorato {// negador de condicion
    public negador(IComparatorStrategy comparador) {
        super(comparador);
    }
    @Override
    public int compare(estudiante s1, estudiante s2) {
        return -comparador.compare(s1, s2);
    }
}
