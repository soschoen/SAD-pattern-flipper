package org.example.commands;

import org.example.Flipper;

public class LoseBallCommand implements Command{
    private Flipper flipper;
    private String text;

    public LoseBallCommand(Flipper flipper, String text) {
        this.flipper = flipper;
        this.text = text;
    }

    public void execute() {
        this.flipper.decrementBalls();
        System.out.println(text);
    }
}
