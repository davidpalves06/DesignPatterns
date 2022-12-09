package org.example;

public class MenuItem {
    private final Command command;

    public MenuItem(Command command) {
        this.command = command;
    }

    void onClick() {
        command.execute();
    }
}
