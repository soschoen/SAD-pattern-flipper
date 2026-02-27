package org.example.scoreDisplayFactory;

public class MediumLowDisplay implements ScoreDisplay {
    public void show(int points) {
        System.out.println(ConsoleColours.GREEN + "...........................");
        System.out.println("..   POINTS: " + points + "   ..");
        System.out.println("..........................." + ConsoleColours.RESET);
    }
}
