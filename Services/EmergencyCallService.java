package Services;

import Commands.Command;

/**
 * EmergencyCallService class represents a concrete command in the Command Pattern.
 * It encapsulates the behavior of an emergency call service.
 * It ımplements the Command interface and overrides execute(), undo(), and getName() methods.
 */

public class EmergencyCallService implements Command {

    @Override
    public void execute() {
        System.out.println("We are sending help.");
    }

    @Override
    public void undo() {
        System.out.println("Call has been canceled.");
    }

    @Override
    public String getName() {
        return "Emergency Call Service";
    }

}
