package org.ResOrManaSystem.interfaces;

import java.util.List;

public interface IFacturas <E> {

    void generar(int numeroMesa, List<E> items);

    void mostrarFactura();
}
