package tasks.Strategy_Decorator;

public class compararNombre implements IComparatorStrategy {

    @Override
    public int compare(estudiante s1, estudiante s2) {
        return s1.getNombre().compareTo(s2.getNombre());
    }
}
