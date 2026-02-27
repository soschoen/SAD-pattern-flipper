package org.example.scoreDisplayFactory;

public class MediumDisplay implements ScoreDisplay {
    public void show(int points) {
        System.out.println(ConsoleColours.RED + "***************************");
        System.out.println("**   POINTS: " + points + "   **");
        System.out.println("***************************" + ConsoleColours.RESET);
    }
}
