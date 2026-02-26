package org.example;

import org.example.elements.*;
import org.example.mediator.StarsMediator;
import org.example.state.State;
import org.example.state.NoCreditState;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flipper {
    private State state;
    private int credits;
    private int balls;
    private int points;
    private Scanner scanner = new Scanner(System.in);
    private List<Element> elements = new ArrayList<>();


    Flipper() {
        this.state = new NoCreditState(this);
    }

    public static void main(String[] args) {
        Flipper flipper = new Flipper();
        flipper.initialise();
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

    public void initialise(){
        StarsMediator starsMediator = new StarsMediator();
        LuckyStarElement luckyStar1 = new LuckyStarElement(this, starsMediator);
        this.elements.add(luckyStar1);
        starsMediator.addLuckyStar(luckyStar1);
        LuckyStarElement luckyStar2 = new LuckyStarElement(this, starsMediator);
        this.elements.add(luckyStar2);
        LuckyStarElement luckyStar3 = new LuckyStarElement(this, starsMediator);
        this.elements.add(luckyStar3);
        starsMediator.addLuckyStar(luckyStar3);
        ShootingStarElement shootingStar = new ShootingStarElement(this, starsMediator);
        this.elements.add(shootingStar);
        starsMediator.setShootingStar(shootingStar);
        AmbivalentAstralAnomalyElement astralAnomaly = new AmbivalentAstralAnomalyElement(this);
        this.elements.add(astralAnomaly);
        Element blackHole = new BlackHoleElement(this);
        this.elements.add(blackHole);
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

    public void incrementBalls() {balls++;}

    public void resetBalls() {balls=3;}

    public int getPoints() {return points;}

    public void addPoints(int pointsToAdd) {this.points += pointsToAdd;}

    public void removePoints(int pointsToRemove) {this.points -= pointsToRemove;}

    public void resetPoints() {points=0;}

    public List<Element> getElements() {return elements;}

}

