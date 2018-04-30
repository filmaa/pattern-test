package patterns.learning.command;


import java.util.HashMap;
import java.util.Map;

import patterns.learning.command.command.Command;

public class RemoteControl {

    private Map<Integer, Command> onCommands;
    private Map<Integer, Command> offCommands;

    public RemoteControl() {
        onCommands = new HashMap<Integer, Command>();
        offCommands = new HashMap<Integer, Command>();
    }

    public void setCommands(Integer slot, Command onCommand, Command offCommand) {
        onCommands.put(slot, onCommand);
        offCommands.put(slot, offCommand);
    }

    public void onButtonWasPushed(Integer slot) {
        onCommands.get(slot).execute();
    }

    public void offButtonWasPushed(Integer slot) {
        offCommands.get(slot).execute();
    }
}
