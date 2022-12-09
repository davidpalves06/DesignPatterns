package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Encomenda{
    private final List<Encomenda> subEncomendas;

    public Box() {
        this.subEncomendas = new ArrayList<>();
    }

    public void add(Encomenda e) {
        subEncomendas.add(e);
    }

    public void remove(Encomenda e) {
        subEncomendas.remove(e);
    }

    @Override
    public Double getPrice() {
        Iterator<Encomenda> iterator = subEncomendas.iterator();
        Double total = 0.1d;
        while (iterator.hasNext()) {
            Encomenda atual = iterator.next();
            total += atual.getPrice();
        }
        return total;
    }
}
