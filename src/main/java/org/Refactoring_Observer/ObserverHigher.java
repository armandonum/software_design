package org.Refactoring_Observer;

public class ObserverHigher implements IObserver {
    private Numbers numbers;

    public ObserverHigher(Numbers numbers)
    {
        this.numbers = numbers;
    }

    @Override
    public void actualizar() {
        int higher = Integer.MIN_VALUE;
        for (int n : numbers.GeTNumberList())
        {
            if(n>higher){
                higher = n;
            }

        }

        System.out.println("el numero mas grande es:  "+ higher);
    }
}
