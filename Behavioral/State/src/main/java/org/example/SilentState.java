package org.example;

public class SilentState implements State{

    @Override
    public void alert() {
        System.out.println("Silenceeeee...");
    }
}
