package patterns.learning.command.command;

import patterns.learning.command.entity.Light;

public class LightOffCommand {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
