package org.example.commands;

import org.example.Flipper;

public class RemovePointsCommand implements Command{
    private final Flipper flipper;
    private final int pointsToRemove;

    public RemovePointsCommand(Flipper flipper, int pointsToRemove){
        this.flipper = flipper;
        this.pointsToRemove = pointsToRemove;
    }

    @Override
    public void execute() {

        this.flipper.removePoints(this.pointsToRemove);
    }
}
