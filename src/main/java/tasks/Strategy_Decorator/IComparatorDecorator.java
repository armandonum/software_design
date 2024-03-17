package tasks.Strategy_Decorator;

public class IComparatorDecorator implements IComparatorStrategy{
    private final IComparatorStrategy decorateComparator;

    public IComparatorDecorator(IComparatorStrategy decorateComparator){
        this.decorateComparator = decorateComparator;
    }

    @Override
    public int compare(estudiante s1, estudiante s2) {
        return -decorateComparator.compare(s1, s2);
    }
}
