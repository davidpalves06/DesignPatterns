package org.example;

import java.io.File;
import java.io.IOException;

public class FileWriter implements MessageWriter{
    @Override
    public void writeMessage(String message) {
        try {
            java.io.FileWriter writer = new java.io.FileWriter("message");
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
