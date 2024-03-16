package org.Refactoring_Observer;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    List<Integer> numbers;
    List<IObserver> observers;
    public Numbers()
    {
        numbers = new ArrayList<>();
        observers = new ArrayList<>();
    }
    public void add(int n)
    {
        if (!numbers.contains(n)){
            numbers.add(n);
            notifyObs();
        }
    }

    private void notifyObs()
    {
        for(IObserver obs : observers){
            obs.actualizar();
        }
    }
    public void attach(IObserver observer)
    {
        observers.add(observer);
    }

    public List<Integer> GeTNumberList(){
        return numbers;
    }
}
