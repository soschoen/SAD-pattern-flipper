package org.example.state;

import org.example.Flipper;

public abstract  class State {

    private Flipper flipper;

    public State(Flipper flipper) {
        this.flipper = flipper;
    }

    public abstract void pressStart();
    public abstract void flipLeft();
    public abstract void flipRight();

    public void insertCoin() {
        this.flipper.incrementCredits();
        System.out.println("You've got " + this.flipper.getCredits() + " credits.");
    }

    public Flipper getFlipper() {
        return flipper;
    }

}
