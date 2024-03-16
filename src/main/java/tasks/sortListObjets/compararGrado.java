package tasks.sortListObjets;

import tasks.sortListObjets.interfaces.IComparatorStrategy;

public class compararGrado implements IComparatorStrategy {

    @Override
    public int compare(estudiante s1, estudiante s2) {
        return Double.compare(s1.getGrado(), s2.getGrado());
    }
}
