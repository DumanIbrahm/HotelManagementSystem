package Behaviors.ConcreteClasses;

import Behaviors.BathroomBehavior;

// The class Jacuzzi implements the BathroomBehavior interface
public class Jacuzzi implements BathroomBehavior {
    // Overriding the getDescription method from the interface
    @Override
    public String getDescription() {
        // Return a string describing the jacuzzi
        return " a nice jacuzzi ";
    }

}
