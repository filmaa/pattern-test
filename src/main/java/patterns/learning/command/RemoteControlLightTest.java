package patterns.learning.command;

import patterns.learning.command.command.LightOnCommand;
import patterns.learning.command.entity.Light;

public class RemoteControlLightTest {

    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);


    }
}
