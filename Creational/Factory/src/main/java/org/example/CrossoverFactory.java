package org.example;

public class CrossoverFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Crossover();
    }
}
