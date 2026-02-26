package org.example.elements;

import org.example.Flipper;
import org.example.commands.MacroCommands.GainSomeLoseSomeMacroCommand;

public class AmbivalentAstralAnomalyElement extends Element{
    public AmbivalentAstralAnomalyElement(Flipper flipper) {
        this.setCommand(new GainSomeLoseSomeMacroCommand(flipper, "~~~~~~~~~You passed through an ambivalent astral anomaly~~~~~~~ You lost some points but for some reason got an extra ball.~~~~~~~", 200));
    }
}
