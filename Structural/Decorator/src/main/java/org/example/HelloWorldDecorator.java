package org.example;

public class HelloWorldDecorator implements MessageWriter{

    MessageWriter writer;

    public HelloWorldDecorator(MessageWriter writer) {
        this.writer = writer;
    }

    @Override
    public void writeMessage(String message) {
        String helloMessage = "Hello World! " + message;
        writer.writeMessage(helloMessage);
    }
}
