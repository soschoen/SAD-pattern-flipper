package org.example.elements;

import org.example.Flipper;
import org.example.commands.AddPointsCommand;
import org.example.commands.Command;
import org.example.mediator.Mediator;
import org.example.visitor.Visitor;

public class LuckyStarElement extends Element {
    private boolean wasHit = false;
    private Mediator mediator;

    public LuckyStarElement(Flipper flipper, Mediator mediator) {
        this.mediator = mediator;
        this.setCommand(new AddPointsCommand(flipper, "*****You hit a LuckyStar***** This gets you extra points. ******", 500));
    }


    public void setWasHit(boolean wasHit) { this.wasHit = wasHit; }
    public boolean getWasHit() { return wasHit; }

    @Override
    public void hit() {
        super.hit();
        if (!wasHit) {
            wasHit = true;
            mediator.elementHit(this);
        }
    }


    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
