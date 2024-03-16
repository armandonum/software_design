package org.Observer;

public class ObserverAdder implements IObserver{
    private Numbers numbers;

    public ObserverAdder(Numbers numbers)
    {
        this.numbers = numbers;
    }
    @Override
    public void actualizar() {
        int sum = 0;
        for (int n : numbers.GeTNumberList())
        {
            sum += n;
        }

        System.out.println("la suma es :  "+ sum);
    }
}
