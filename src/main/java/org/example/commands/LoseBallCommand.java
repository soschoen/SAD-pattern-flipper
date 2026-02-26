package org.example.commands;

import org.example.Flipper;
import org.example.elements.LuckyStarElement;
import org.example.elements.ShootingStarElement;
import org.example.visitor.ResetVisitor;
import org.example.visitor.Visitor;
import org.example.elements.Element;


public class LoseBallCommand implements Command{
    private Flipper flipper;
    private String text;

    public LoseBallCommand(Flipper flipper, String text) {
        this.flipper = flipper;
        this.text = text;
    }

    public void execute() {
        this.flipper.decrementBalls();
        System.out.println(text);
        Visitor resetVisitor = new ResetVisitor();
        for (Element e : flipper.getElements()) {
            if (e instanceof LuckyStarElement || e instanceof ShootingStarElement) {
                e.accept(resetVisitor);
            }
        }
    }
}
