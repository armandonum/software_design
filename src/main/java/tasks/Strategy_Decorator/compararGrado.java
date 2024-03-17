package tasks.Strategy_Decorator;

public class compararGrado implements IComparatorStrategy {

    @Override
    public int compare(estudiante s1, estudiante s2) {
        return Double.compare(s1.getGrado(), s2.getGrado());
    }
}
