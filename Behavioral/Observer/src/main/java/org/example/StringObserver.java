package org.example;

public class StringObserver implements Observer{
    private String string;
    @Override
    public void update(Object o) {
        this.string = (String) o;
    }

    @Override
    public String toString() {
        return "StringObserver{" +
                "string='" + string + '\'' +
                '}';
    }
}
