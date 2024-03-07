package org.ResOrManaSystem;

import org.ResOrManaSystem.interfaces.IFacturas;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Facturas implements IFacturas {
    private Map<Integer, String> facturas;
    public Facturas(){
        this.facturas=new HashMap<>();
    }

    @Override
    public void generar(int numeroMesa, List items) {

    }

    @Override
    public void mostrarFactura() {

    }
}
