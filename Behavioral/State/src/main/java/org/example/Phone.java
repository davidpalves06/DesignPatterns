package org.example;

public class Phone {
    private State currentState;

    public Phone() {
        this.currentState = new LoudState();
    }

    public void silence() {
        this.currentState = new SilentState();
    }

    public void vibrant() {
        this.currentState = new VibrationState();
    }

    public void soundOn() {
        this.currentState = new LoudState();
    }

    public void callAlert() {
        currentState.alert();
    }
}
