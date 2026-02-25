package org.example.commands;

import org.example.Flipper;

public class AddPointsCommand implements Command{
    private final Flipper flipper;
    private final int pointsToAdd;

    public AddPointsCommand(Flipper flipper, int points){
        this.flipper = flipper;
        this.pointsToAdd = points;
    }

    @Override
    public void execute() {
        this.flipper.addPoints(this.pointsToAdd);
    }
}
