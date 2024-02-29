package org.ResOrManaSystem;

import java.util.HashMap;
import java.util.Map;

public class gestionMesas implements IgestionMesas{
private Map<Integer, String> mesas;
    public gestionMesas(){
        this.mesas=new HashMap<>();
    }

    @Override
    public void asignar_mesa(int numeroMesa, String estado) {

    }

    @Override
    public void mostrarmesa() {

    }
}
