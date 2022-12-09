package org.example;

public class StringObservable extends Observable{
    private String message;

    public StringObservable(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        super.notifyObservers(this.message);
    }

}
