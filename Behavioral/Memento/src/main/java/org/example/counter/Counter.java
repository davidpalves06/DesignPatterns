package org.example.counter;

public class Counter {
    private int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter() {
        this.counter++;
        System.out.println("Counter = " + this.counter);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }

    public CounterMemento saveSnapshot() {
        System.out.println("O estado foi guardado num memento! Counter = " + this.counter);
        return new CounterMemento(this.counter);
    }

    public void restoreState(CounterMemento memento) {
        this.counter = memento.getCounter();
        System.out.println("O estado foi restaurado através do memento! Counter = " + this.counter);
    }
}
