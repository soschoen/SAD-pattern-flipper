package org.example.visitor;

import org.example.elements.LuckyStarElement;
import org.example.elements.ShootingStarElement;

public class ResetVisitor implements Visitor {

    @Override
    public void visit(LuckyStarElement luckyStar) {
        luckyStar.setWasHit(false);
        System.out.println("LuckyStar was reset.");
    }

    @Override
    public void visit(ShootingStarElement shootingStar) {
        shootingStar.setActive(false);
        System.out.println("ShootingStar was reset.");
    }
}
