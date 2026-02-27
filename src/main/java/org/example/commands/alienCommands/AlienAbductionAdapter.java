package org.example.commands.alienCommands;

import org.example.Flipper;
import org.example.commands.Command;
import org.example.elements.Element;
import org.example.elements.LuckyStarElement;
import org.example.elements.ShootingStarElement;
import org.example.visitor.ResetVisitor;
import org.example.visitor.Visitor;

//The AlienAbductionAdapter serves two purposes:
// Firstly, it wraps AlienAbduction so it can be read as a command.
// Secondly, it converts llabs into balls using the knowledge that 1 llab equals 2 balls.

public class AlienAbductionAdapter implements Command {
    private AlienAbduction alienAbduction;
    private Flipper flipper;
    private int llabsToLose;
    private String text;

    public AlienAbductionAdapter(AlienAbduction alienAbduction, Flipper flipper) {
        this.alienAbduction = alienAbduction;
        this.flipper = flipper;
        this.llabsToLose = alienAbduction.getLlabsToLose();
        this.text = alienAbduction.getText();
    }


    @Override
    public void execute() {
        int ballsToLose = this.llabsToLose*2;

        for (int i = 0; i < ballsToLose; i++) {
            flipper.decrementBalls();
        }

        System.out.println(this.text);

        Visitor resetVisitor = new ResetVisitor();
        for (Element e : flipper.getElements()) {
            if (e instanceof LuckyStarElement || e instanceof ShootingStarElement) {
                e.accept(resetVisitor);
            }
        }


    }
}
