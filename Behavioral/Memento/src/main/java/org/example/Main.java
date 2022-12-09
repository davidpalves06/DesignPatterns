package org.example;

import org.example.counter.Counter;

public class Main {
    public static void main(String[] args) {
        CounterSnapshot counterSnapshot = new CounterSnapshot();
        Counter counter = new Counter(0);
        counter.incrementCounter();
        counter.incrementCounter();
        counterSnapshot.addSnapshot(counter.saveSnapshot());
        counter.incrementCounter();
        counter.incrementCounter();
        counterSnapshot.addSnapshot(counter.saveSnapshot());
        counter.incrementCounter();
        counter.restoreState(counterSnapshot.retrieveSnapshot());
        counter.restoreState(counterSnapshot.retrieveSnapshot());
    }
}