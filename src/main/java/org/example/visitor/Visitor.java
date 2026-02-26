package org.example.visitor;

import org.example.elements.LuckyStarElement;
import org.example.elements.ShootingStarElement;

public interface Visitor {
    void visit(LuckyStarElement luckyStar);
    void visit(ShootingStarElement shootingStar);
}
