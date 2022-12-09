package org.example;

public class Button {
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    void onClick() {
        command.execute();
    }
}
