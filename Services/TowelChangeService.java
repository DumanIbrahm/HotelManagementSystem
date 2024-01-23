package Services;

import Commands.Command;
/**
 * TowelChangeService class represents a concrete command in the Command Pattern.
 * It encapsulates the behavior of a towel change service.
 * It ımplements the Command interface and overrides execute(), undo(), and getName() methods.
 */
public class TowelChangeService implements Command {

    @Override
    public void execute() {
        System.out.println("We brought you new towels.");
    }

    @Override
    public void undo() {
        System.out.println("Call has been canceled.");
    }

    @Override
    public String getName() {
        return "Towel Change Service";
    }
}
