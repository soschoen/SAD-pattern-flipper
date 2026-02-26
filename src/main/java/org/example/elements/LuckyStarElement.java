package org.example.elements;

import org.example.Flipper;
import org.example.commands.AddPointsCommand;
import org.example.commands.Command;

public class LuckyStarElement extends Element {
    public LuckyStarElement(Flipper flipper) {
        this.setCommand(new AddPointsCommand(flipper, "*****You hit a LuckyStar***** This gets you extra points. ******", 500));
    }
}
