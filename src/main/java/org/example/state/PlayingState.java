package org.example.state;

import org.example.Flipper;
import org.example.commands.TextOutputCommand;
import org.example.elements.Element;

import java.util.Collections;
import java.util.List;

public class PlayingState extends State {

    private List<Element> elements = getFlipper().getElements();

    public PlayingState(Flipper flipper) {
        super(flipper);
    }

    @Override
    public void pressStart() {
        System.out.println("What are you doing? The ball is already rolling. Keep your eyes on the ball and play instead of fumbling with the start button!");
    }

    @Override
    public void flipLeft() {
        Collections.shuffle(elements);
        elements.getFirst().hit();
        new TextOutputCommand("Total points: "+ getFlipper().getPoints()+"\nNumber of balls: "+getFlipper().getBalls()).execute();
        countBalls();
    }

    @Override
    public void flipRight() {
        countBalls();
        Collections.shuffle(elements);
        elements.getLast().hit();
        new TextOutputCommand("Total points: "+ getFlipper().getPoints()+"\nNumber of balls: "+getFlipper().getBalls()).execute();
        countBalls();
    }

    @Override
    public void insertCoin() {
        super.insertCoin();
        System.out.println("What are you doing? This flipper isn't as corrupt as the US president! You won't win by throwing money at it. Now you have even more credit but you will lose the ball if you don't pay attention!");
    }

    public void countBalls() {
        int balls = getFlipper().getBalls();
        if (balls <= 0) {
            System.out.println("Well, that was your last ball. GAME OVER, sucker! Press start to see your end score.");
            getFlipper().decrementCredits();
            getFlipper().setState(new EndState(getFlipper()));
        }
    }
}
