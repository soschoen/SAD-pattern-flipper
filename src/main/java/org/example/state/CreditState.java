package org.example.state;

import org.example.Flipper;

public class CreditState extends State {
    public CreditState(Flipper flipper) {
        super(flipper);
    }

    int credits = getFlipper().getCredits();

    @Override
    public void pressStart() {
        System.out.println("Game started! Keep the ball moving!");
        getFlipper().setState(new PlayingState(getFlipper()));
        getFlipper().resetBalls();
        getFlipper().resetPoints();
    }

    @Override
    public void flipLeft() {
        System.out.println("Didn't you notice there is no ball? You need to press start to play!");
    }

    @Override
    public void flipRight() {
        System.out.println("Are you playing with an imaginary ball? You need to press start to play!");
    }

    @Override
    public void insertCoin() {
        super.insertCoin();
        System.out.println("Now you have even more credit. But you still need to press start to start your game!");
    }

}
