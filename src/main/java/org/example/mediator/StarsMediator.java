package org.example.mediator;

import org.example.elements.Element;
import org.example.elements.LuckyStarElement;
import org.example.elements.ShootingStarElement;

import java.util.ArrayList;
import java.util.List;

public class StarsMediator implements Mediator {
    private List<LuckyStarElement> luckyStars = new ArrayList<>();
    private ShootingStarElement shootingStar;

    public void addLuckyStar(LuckyStarElement luckyStar) { luckyStars.add(luckyStar); }
    public void setShootingStar(ShootingStarElement shootingStar) { this.shootingStar = shootingStar; }

    @Override
    public void elementHit(Element element) {
        if (element instanceof LuckyStarElement) {
            checkLuckyStars();
        } else if (element instanceof ShootingStarElement) {
            resetStars();
        }
    }

    private void checkLuckyStars() {
        boolean allHit = luckyStars.stream().allMatch(LuckyStarElement::getWasHit);

        if (allHit) {
            System.out.println("Congrats! You have collected all lucky stars. If you stumble across a Shooting Star, a wish will become true.");
            shootingStar.setActive(true);
        }
    }


    private void resetStars() {
        for (LuckyStarElement luckyStar : luckyStars) {
            luckyStar.setWasHit(false);
        }
        shootingStar.setActive(false);
        System.out.println("There's your special prize. If you are greedy enough, you can start collecting lucky stars again.");
    }
}
