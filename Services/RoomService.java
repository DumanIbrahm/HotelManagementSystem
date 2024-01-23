package Services;

import Commands.Command;
/**
 * RoomService class represents a concrete command in the Command Pattern.
 * It encapsulates the behavior of a room service.
 * It ımplements the Command interface and overrides execute(), undo(), and getName() methods.
 */
public class RoomService implements Command {

    @Override
    public void execute() {
        System.out.println("We are sending your orders to your room.");
    }

    @Override
    public void undo() {
        System.out.println("Call has been canceled.");
    }

    @Override
    public String getName() {
        return "Room Service";
    }
}
