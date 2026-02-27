package org.example.commands.macroCommands;

import org.example.commands.Command;

import java.util.ArrayList;
import java.util.List;

public abstract class MacroCommand implements Command {

    protected List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

}
