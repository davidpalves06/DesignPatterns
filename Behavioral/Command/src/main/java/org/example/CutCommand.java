package org.example;

public class CutCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Cutting selected text!");
    }
}
