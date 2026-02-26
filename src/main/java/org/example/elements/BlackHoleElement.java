package org.example.elements;

import org.example.Flipper;
import org.example.commands.AddPointsCommand;
import org.example.commands.LoseBallCommand;

public class BlackHoleElement extends Element{
    public BlackHoleElement(Flipper flipper) {
        this.setCommand(new LoseBallCommand(flipper, "------You hit a Black Hole ----- You lost your ball. ------"));
    }
}
