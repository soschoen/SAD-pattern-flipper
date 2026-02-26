package org.example.commands;

import org.example.Flipper;

public class ExtraBallCommand implements Command {
    private final Flipper flipper;

    public ExtraBallCommand(Flipper flipper){
        this.flipper = flipper;
    }

    @Override
    public void execute() {

        this.flipper.incrementBalls();
    }
}
