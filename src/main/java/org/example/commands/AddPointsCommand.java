package org.example.commands;

import org.example.Flipper;

public class AddPointsCommand implements Command{
    private final Flipper flipper;
    private final int pointsToAdd;
    private final String text;

    public AddPointsCommand(Flipper flipper, String text, int pointsToAdd){
        this.flipper = flipper;
        this.text = text;
        this.pointsToAdd = pointsToAdd;
    }

    @Override
    public void execute() {

        this.flipper.addPoints(this.pointsToAdd);
        System.out.println(text);
    }
}
