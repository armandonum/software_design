package org.pruebas;

import tasks.sortListObjets.interfaces.IComparatorStrategy;

abstract class Decorato  implements IComparatorStrategy {
    public IComparatorStrategy comparador;
    public Decorato(IComparatorStrategy comparador){
        
        this.comparador = comparador;
    }
    
}
