package org.Refactoring_Observer;

public class ObserverPair implements IObserver {
    private Numbers numbers;
    ICondition condition;
    public ObserverPair(Numbers numbers){
        this.numbers = numbers;
        this.condition = new ConditionMultiple(2);
    }
    @Override
    public void actualizar() {
        int sum = 0;

        for (int n : numbers.GeTNumberList())
        {
            if(condition.evaluate(n))
            {
                sum += n;
            }
            System.out.println("la sumatoria de numeros pares es:  "+ sum);
        }

    }
}
