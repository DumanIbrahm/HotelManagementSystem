package Behaviors;
/**
 * This interface defines the behavior for bathroom-related objects
 * and is intended for use in the Strategy Pattern.
 */
public interface BathroomBehavior {
    // Gets a description of the bathroom behavior. This method will be overridden by the concrete classes
    public String getDescription();
}
