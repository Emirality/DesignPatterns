package Observer;

import java.util.ArrayList;
import java.util.List;

public class Whale {

    private int balance;
    boolean sellOrNot;

    List<Observer> observers;

    public Whale(int balance) {
        this.observers = new ArrayList<>();
        this.balance = balance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(boolean sellOrNot) {
        for (Observer obs : observers) {
            obs.Action(sellOrNot);
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        sellOrNot = this.balance > balance;
        this.balance = balance;
        notifyObservers(sellOrNot);

    }
}
