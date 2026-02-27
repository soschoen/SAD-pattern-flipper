package org.example.elements;

import org.example.Flipper;
import org.example.commands.macroCommands.SuperPrizeCommand;
import org.example.mediator.Mediator;
import org.example.visitor.Visitor;

public class ShootingStarElement extends Element{
    private boolean active = false;
    private Mediator mediator;

    public ShootingStarElement(Flipper flipper, Mediator mediator) {
        this.mediator = mediator;
        this.setCommand(new SuperPrizeCommand(flipper, "°°°°°°°Wish upon a falling star°°°°°°Your wish became true: You got extra points AND an extra ball!°°°°°", 777));
    }

    public void setActive(boolean active) { this.active = active; }
    public boolean getActive() { return active; }

    @Override
    public void hit() {
        if (active) {
            super.hit();
            mediator.elementHit(this);
        } else {
            System.out.println("°°°°°Wish upon a falling star...°°°° Keep wishing until you have collected all lucky stars!°°°°°°");
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
