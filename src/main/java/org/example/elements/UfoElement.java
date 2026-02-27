package org.example.elements;

import org.example.Flipper;
import org.example.commands.alienCommands.AlienAbduction;
import org.example.commands.alienCommands.AlienAbductionAdapter;
import org.example.visitor.Visitor;

//The UfoElement is the element that uses the AlienAbductionAdapter to execute the AlienAbduction

public class UfoElement extends Element {
    AlienAbduction alienAbduction = new AlienAbduction(1, "°_°_°_°_°_° You were abducted by aliens°_°_°_°_°_°_°");

    public UfoElement(Flipper flipper) {
        this.setCommand(new AlienAbductionAdapter(alienAbduction, flipper));
    }

    public void accept(Visitor visitor) {}

}
