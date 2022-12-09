package org.example;

public class DeleteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Deleting selected text!");
    }
}
