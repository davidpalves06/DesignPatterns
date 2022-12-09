package org.example;

public class Printer implements MessageWriter{
    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}
