package Behaviors;
/**
 * This interface defines the behavior for balcony-related objects
 * and is intended for use in the Strategy Pattern.
 */
public interface BalconyBehavior {
    // Gets a description of the bathroom behavior. This method will be overridden by the concrete classes
    public String getDescription();
}
