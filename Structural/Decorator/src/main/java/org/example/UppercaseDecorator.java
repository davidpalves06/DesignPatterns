package org.example;

import java.util.Locale;

public class UppercaseDecorator implements MessageWriter{
    MessageWriter writer;

    public UppercaseDecorator(MessageWriter writer) {
        this.writer = writer;
    }

    @Override
    public void writeMessage(String message) {
        String uppermessage = message.toUpperCase(Locale.ROOT);
        writer.writeMessage(uppermessage);
    }
}
