package org.example.commands.MacroCommands;

import org.example.Flipper;
import org.example.commands.AddPointsCommand;
import org.example.commands.ExtraBallCommand;
import org.example.commands.RemovePointsCommand;
import org.example.commands.TextOutputCommand;

public class SuperPrizeCommand extends MacroCommand{
    public SuperPrizeCommand(Flipper flipper, String text, int pointsToAdd) {
        this.commands.add(new ExtraBallCommand(flipper));
        this.commands.add(new AddPointsCommand(flipper, text, pointsToAdd));
    }
}
