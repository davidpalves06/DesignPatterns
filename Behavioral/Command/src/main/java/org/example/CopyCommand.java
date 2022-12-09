package org.example;

public class CopyCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Copying selected text");
    }
}
