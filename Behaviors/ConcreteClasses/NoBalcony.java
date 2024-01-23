package Behaviors.ConcreteClasses;

import Behaviors.BalconyBehavior;
// The class NoBalcony implements the BalconyBehavior interface
public class NoBalcony implements BalconyBehavior {
    // Overriding the getDescription method from the interface
    @Override
    public String getDescription() {
        // Return a string describing the noBalcony
        return " no balcony ";
    }

}
