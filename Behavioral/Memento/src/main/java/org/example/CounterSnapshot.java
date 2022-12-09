package org.example;

import org.example.counter.CounterMemento;

import java.util.ArrayList;
import java.util.List;

public class CounterSnapshot {
    private List<CounterMemento> counterSnapshots;

    public CounterSnapshot() {
        this.counterSnapshots = new ArrayList<>();
    }

    public void addSnapshot(CounterMemento memento) {
        counterSnapshots.add(memento);
    }

    public CounterMemento retrieveSnapshot() {
        CounterMemento counterMemento = counterSnapshots.get(counterSnapshots.size() - 1);
        counterSnapshots.remove(counterSnapshots.size() - 1);
        return counterMemento;
    }
}
