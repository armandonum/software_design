package org.Refactoring_Observer;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        ObserverAdder adder = new ObserverAdder(numbers);
        numbers.attach(adder);

        ObserverHigher higher =new ObserverHigher(numbers);
        numbers.attach(higher);

        ObserverPair pair = new ObserverPair(numbers);
        numbers.attach(pair);

        ObserverOdd odd = new ObserverOdd(numbers);
        numbers.attach(odd);

        numbers.add(10);
        numbers.add(20);
        numbers.add(60);
        numbers.add(80);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

    }
}
