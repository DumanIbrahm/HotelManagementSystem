package Services;

import Commands.Command;
/**
 * SheetChangeService class represents a concrete command in the Command Pattern.
 * It encapsulates the behavior of a sheet change service.
 * It ımplements the Command interface and overrides execute(), undo(), and getName() methods.
 */
public class SheetChangeService implements Command {

    @Override
    public void execute() {
        System.out.println("We changed your sheets.");
    }

    @Override
    public void undo() {
        System.out.println("Call has been canceled.");
    }

    @Override
    public String getName() {
        return "Sheet Change Service";
    }

}
