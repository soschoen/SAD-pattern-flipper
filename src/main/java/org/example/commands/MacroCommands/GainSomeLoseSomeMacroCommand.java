package org.example.commands.MacroCommands;

import org.example.Flipper;
import org.example.commands.ExtraBallCommand;
import org.example.commands.RemovePointsCommand;
import org.example.commands.TextOutputCommand;

public class GainSomeLoseSomeMacroCommand extends MacroCommand {

    public GainSomeLoseSomeMacroCommand(Flipper flipper, String text, int pointsToRemove) {
        this.commands.add(new RemovePointsCommand(flipper, pointsToRemove));
        this.commands.add(new ExtraBallCommand(flipper));
        this.commands.add(new TextOutputCommand(text));
    }

}
