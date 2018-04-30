package patterns.learning.command.command;

import patterns.learning.command.entity.GarageDoor;

public class GarageLightOnCommand implements Command {

    private GarageDoor garageDoor;

    public GarageLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.lightOn();
    }
}
