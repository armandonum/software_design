package org.ResOrManaSystem;

import java.util.ArrayList;
import java.util.List;

public class TomarOrden<T> implements ITomarOrden<T>{
    private List<Orden> ordenes;
    private List<Orden> ordenesCompletadas;
    public TomarOrden(){
        this.ordenes=new ArrayList<>();
        this.ordenesCompletadas=new ArrayList<>();
    }
    @Override
    public void Orden() {

    }

    @Override
    public void pista_Orden(Object orden) {

    }

    @Override
    public void mostrarOrden() {

    }
}
