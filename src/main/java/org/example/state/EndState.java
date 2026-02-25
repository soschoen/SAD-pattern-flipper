package org.example.state;

import org.example.Flipper;

public class EndState extends State {
    public EndState(Flipper flipper) { super(flipper); }

    @Override
    public void pressStart() {
        int points = getFlipper().getPoints();
        System.out.println("There you go: " + points + "points. Are you happy now?");

        if(getFlipper().getCredits() == 0){
            System.out.println("You're broke. If you want to continue playing, you will need to insert a coin.");
            getFlipper().setState(new NoCreditState(getFlipper()));
        } else {
            int credits = getFlipper().getCredits();
            System.out.println("You've got "+credits+" credits left. Press start to play again.");
            getFlipper().setState(new CreditState(getFlipper()));
        }
    }

    @Override
    public void flipLeft() {
        System.out.println("What are you doing flipping those things? I said: Press start to continue!");
    }

    @Override
    public void flipRight() {
        System.out.println("What are you doing flipping those things? I said: Press start to continue!");
    }

    @Override
    public void insertCoin() {
        super.insertCoin();
        System.out.println("Thank you for the coin. But you still need to press start to continue.");
    }
}
