package org.example.elements;

import org.example.commands.Command;

public abstract class Element {
    private Command command;

    public void hit() {
        if (command != null) {
            command.execute();
        }
    }

    public void setCommand(Command command) {
        this.command = command;
    }

}
