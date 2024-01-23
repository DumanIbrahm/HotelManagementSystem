package Behaviors;
/**
 * This interface defines the behavior for view-related objects
 * and is intended for use in the Strategy Pattern.
 */
public interface ViewBehavior {
    // Gets a description of the view behavior. This method will be overridden by the concrete classes
    public String getDescription();
}
