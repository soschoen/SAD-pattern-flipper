package org.example.state;

import org.example.Flipper;

public class NoCreditState extends State{

    public NoCreditState(Flipper flipper){
        super(flipper);
    }

    @Override
    public void pressStart() {
        System.out.println("Do you think you can play for free? You need to insert a coin first!");
    }

    @Override
    public void flipLeft() {
        System.out.println("There is no ball. What are you trying to play with? Insert coin to get started!");
    }

    @Override
    public void flipRight() {
        System.out.println("What are you trying to achieve here? Insert coin to get started!");
    }

    @Override
    public void insertCoin() {
        super.insertCoin();
        System.out.println("Hooray! You can play now! Press start to start your game!");
        super.getFlipper().setState(new CreditState(getFlipper()));
    }

}