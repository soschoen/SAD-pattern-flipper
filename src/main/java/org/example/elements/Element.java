package org.example.elements;

import org.example.commands.Command;
import org.example.visitor.Visitor;

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

    public abstract void accept(Visitor visitor);



}
