package org.example.scoreDisplayFactory;

public class HighDisplay implements ScoreDisplay {
    public void show(int points) {
        System.out.println(ConsoleColours.PURPLE + "*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("*~   POINTS: " + points + "   ~*");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*" + ConsoleColours.RESET);
    }
}
