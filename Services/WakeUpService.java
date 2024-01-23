package Services;

import Commands.Command;
/**
 * WakeUpService class represents a concrete command in the Command Pattern.
 * It encapsulates the behavior of a wake up service.
 * It ımplements the Command interface and overrides execute(), undo(), and getName() methods.
 */

public class WakeUpService implements Command {

    @Override
    public void execute() {
        System.out.println("We are waking you up.");
    }

    @Override
    public void undo() {
        System.out.println("Call has been canceled.");
    }

    @Override
    public String getName() {
        return "Wake Up Service";
    }
}
