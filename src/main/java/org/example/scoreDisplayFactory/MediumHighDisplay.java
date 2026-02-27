package org.example.scoreDisplayFactory;

public class MediumHighDisplay implements ScoreDisplay {
    public void show(int points) {
        System.out.println(ConsoleColours.CYAN + "~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~   POINTS: " + points + "   ~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~" + ConsoleColours.RESET);
    }
}
