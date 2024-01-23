package Services;

import Commands.Command;

/**
 * CleaningService class represents a concrete command in the Command Pattern.
 * It encapsulates the behavior of a cleaning service
 * It ımplements the Command interface and overrides execute(), undo(), and getName() methods.
 */
 

public class CleaningService implements Command {
  
    @Override
    public void execute() {
        System.out.println("We are sending the maid to your room.");
    }

    @Override
    public void undo() {
        System.out.println("Call has been canceled.");
    }

    @Override
    public String getName() {
        return "Cleaning Service";
    }

}
