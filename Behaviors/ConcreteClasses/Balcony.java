package Behaviors.ConcreteClasses;

import Behaviors.BalconyBehavior;

// The class Balcony implements the BalconyBehavior interface
public class Balcony implements BalconyBehavior {

    // Overriding the getDescription method from the interface
    @Override
    public String getDescription() {
        // Return a string describing the balcony
        return " a balcony ";
    }

}
