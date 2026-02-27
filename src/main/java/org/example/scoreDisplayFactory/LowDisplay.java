package org.example.scoreDisplayFactory;

public class LowDisplay implements ScoreDisplay {
    public void show(int points) {
        System.out.println(ConsoleColours.YELLOW + "=== SCORE: " + points + " ===" + ConsoleColours.RESET);
    }
}
