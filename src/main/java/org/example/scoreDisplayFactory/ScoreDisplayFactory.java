package org.example.scoreDisplayFactory;

public class ScoreDisplayFactory {
    public static ScoreDisplay getDisplay(int points) {
        if (points < 1000) {
            return new LowDisplay();
        } else if (points < 2000) {
            return new MediumLowDisplay();
        } else if (points < 3000) {
            return new MediumDisplay();
        } else if (points < 4000) {
            return new MediumHighDisplay();
        } else {
            return new HighDisplay();
        }
    }
}
