package org.example.commands.alienCommands;

import org.example.Flipper;
import org.example.elements.Element;
import org.example.elements.LuckyStarElement;
import org.example.elements.ShootingStarElement;
import org.example.visitor.ResetVisitor;
import org.example.visitor.Visitor;


// The purpose of this class is to demonstrate the adapter pattern.
// Functionally, it is a command. Yet it does not implement the interface "Command".
// Thus, technically it is not a command.
// Furthermore, it uses the alien unit "llabs" instead of "balls". Which, of course, the rest of the program cannot work with.

public class AlienAbduction {
    private int LLabsToLose;
    private String text;

    public AlienAbduction(int LLabsToLose, String text) {
        this.LLabsToLose = LLabsToLose;
        this.text = text;
    }

    public void execute() {
        System.out.println(text+" "+LLabsToLose);

    }

    public int getLlabsToLose() { return LLabsToLose; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public void setLlabsToLose(int llabsToLose) {this.LLabsToLose = llabsToLose; }
}
