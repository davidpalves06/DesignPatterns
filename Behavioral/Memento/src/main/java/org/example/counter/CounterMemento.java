package org.example.counter;

public class CounterMemento {
    private int counter;

    protected CounterMemento(int counter) {
        this.counter = counter;
    }

    protected int getCounter() {
        return counter;
    }

    protected void setCounter(int counter) {
        this.counter = counter;
    }
}
