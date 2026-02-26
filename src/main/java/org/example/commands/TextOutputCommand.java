package org.example.commands;

import org.example.Flipper;

public class TextOutputCommand implements Command {
    private String text;

    public TextOutputCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println(text);
    }
}
