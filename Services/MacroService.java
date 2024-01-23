package Services;

import Commands.Command;

/**
 * MacroService class represents a concrete command in the Command Pattern.
 * It encapsulates the behavior of a macro service, which is a composite command
 * consisting of multiple sub-commands (cleaning, sheet change, towel change).
 */
public class MacroService implements Command {
    // Array to store sub-commands
    Command[] commands;

    /**
     * Constructor initializes the macro service with sub-commands.
     */
    public MacroService() {
        commands = new Command[3];
        commands[0] = new CleaningService();
        commands[1] = new SheetChangeService();
        commands[2] = new TowelChangeService();
    }

    /**
     * Executes the macro service by invoking each sub-command.
     */
    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    /**
     * Undoes the macro service by canceling the composite action.
     */
    @Override
    public void undo() {
        System.out.println("Call has been canceled.");
    }

    /**
     * Gets the name or identifier of the macro service.
     */
    @Override
    public String getName() {
        return "Macro Service";
    }
}
