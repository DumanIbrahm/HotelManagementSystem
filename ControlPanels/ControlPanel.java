package ControlPanels;

import Commands.Command;
import Services.CleaningService;
import Services.EmergencyCallService;
import Services.MacroService;
import Services.RoomService;
import Services.SheetChangeService;
import Services.TowelChangeService;
import Services.WakeUpService;

/**
 * ControlPanel class represents a remote control system implementing the
 * Command Pattern.
 * It serves as an invoker, managing a collection of command objects associated
 * with
 * various services. Each button on the control panel is linked to a specific
 * command,
 * allowing the user to execute and undo operations seamlessly.
 */
public class ControlPanel {
    // An array to store command objects
    Command[] commands;

    // Constructor initializes the commands array with instances of various services
    public ControlPanel() {
        commands = new Command[7];
        commands[0] = new CleaningService();
        commands[1] = new WakeUpService();
        commands[2] = new SheetChangeService();
        commands[3] = new TowelChangeService();
        commands[4] = new EmergencyCallService();
        commands[5] = new RoomService();
        commands[6] = new MacroService();
    }

    // Method to execute the command associated with a specific button
    public void buttonWasPressed(int slot) {
        commands[slot].execute();
    }

    // Method to undo the last executed command associated with a specific button
    public void buttonUndo(int slot) {
        commands[slot].undo();
    }

    // Method to generate a string representation of the ControlPanel object
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < commands.length; i++) {
            stringBuff.append("[" + (i + 1) + "] " + commands[i].getName() + "\n");
        }
        stringBuff.append("[0] Exit\n");
        return stringBuff.toString();
    }
}
