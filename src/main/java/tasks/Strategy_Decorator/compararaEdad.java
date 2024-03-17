package tasks.Strategy_Decorator;

public class compararaEdad implements IComparatorStrategy {
    @Override
    public int compare(estudiante s1, estudiante s2) {
        return Integer.compare(s1.getEdad(), s2.getEdad());
    }
}
