package tasks.Restaurant.interfaces;

public interface observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
