package org.Observer;

public class ObserverOdd implements IObserver{
    private Numbers numbers;
    ICondition condition;
    public ObserverOdd(Numbers numbers){
        this.numbers = numbers;
        this.condition = new ConditionDenier(new ConditionMultiple(2));

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
            System.out.println("la sumatoria de numeros impares es :  "+ sum);
        }
    }
}
