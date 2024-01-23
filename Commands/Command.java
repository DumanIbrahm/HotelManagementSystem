package Commands;
/**
 * Command interface for the Command Pattern.
 * Declares methods for executing, undoing, and getting the name of a command.
 */
public interface Command {
    // Execute the command
    public void execute();
    // Undo the command
    public void undo();
    // Get the name of the command
    public String getName();
}
