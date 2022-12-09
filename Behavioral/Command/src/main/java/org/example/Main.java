package org.example;

public class Main {
    public static void main(String[] args) {
        Command copyCommand = new CopyCommand();
        Command cutCommand = new CutCommand();
        Command deleteCommand = new DeleteCommand();

        Button ctrl_C_Button = new Button(copyCommand);
        Button ctrl_X_Button = new Button(cutCommand);

        MenuItem deleteMenuItem = new MenuItem(deleteCommand);
        MenuItem copyMenuItem = new MenuItem(copyCommand);

        ctrl_C_Button.onClick();
        ctrl_X_Button.onClick();
        deleteMenuItem.onClick();
        copyMenuItem.onClick();
    }
}