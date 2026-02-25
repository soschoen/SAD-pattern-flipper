package org.example;

import org.example.state.State;
import org.example.state.NoCreditState;

import java.util.Scanner;

public class Flipper {
    private State state;
    private int credits;
    private int balls;
    private int points;
    private Scanner scanner = new Scanner(System.in);

    Flipper() {
        this.state = new NoCreditState(this);
    }

    public static void main(String[] args) {
        Flipper flipper = new Flipper();
        flipper.play();

    }

    public void play() {
        System.out.println("Enter 1 to press start, 2 to flip left, 3 to flip right, 4 to insert a coin and 5 to walk away.");
        while (true) {
            int action = scanner.nextInt();
            switch (action) {
                case 1: state.pressStart();
                break;
                case 2: state.flipLeft();
                break;
                case 3: state.flipRight();
                break;
                case 4: state.insertCoin();
                break;
                case 5:
                    System.out.println("Bye!");
                    return;
            }
        }
    }

    public int getCredits() {return credits;}

    public void incrementCredits() {
        credits++;
    }

    public void decrementCredits() {
        credits--;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getBalls() {return balls;}

    public void decrementBalls() {balls--;}

    public void resetBalls() {balls=3;}

    public int getPoints() {return points;}

    public void decrementPoints() {points--;}

    public void incrementPoints() {points++;}

    public void resetPoints() {points=0;}

}

