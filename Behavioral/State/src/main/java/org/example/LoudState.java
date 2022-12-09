package org.example;

public class LoudState implements State{
    @Override
    public void alert() {
        System.out.println("Ringtone playing...");
    }
}
