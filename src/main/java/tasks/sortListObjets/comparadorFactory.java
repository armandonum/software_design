package tasks.sortListObjets;

import tasks.sortListObjets.interfaces.IComparatorFactory;
import tasks.sortListObjets.interfaces.IComparatorStrategy;

public class comparadorFactory implements IComparatorFactory {


    private static comparadorFactory instance;

    private comparadorFactory() {
    }
    public static comparadorFactory getInstance() {
        if (instance == null) {
            instance = new comparadorFactory();
        }
        return instance;
    }
    @Override
    public IComparatorStrategy crearComparador(String id) {

        if (id.equals("nombre")) {
            return new compararNombre();
        } else if (id.equals("edad")) {
            return new compararaEdad();
        } else if (id.equals("grado")) {
            return new compararGrado();
        } else if (id.equals("conbinados")) {
            return new combinado();
        }
        return null;
    }
}

