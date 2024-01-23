package Behaviors.ConcreteClasses;

import Behaviors.BathroomBehavior;
// The class Shower implements the BathroomBehavior interface
public class Shower implements BathroomBehavior {
    // Overriding the getDescription method from the interface
    @Override
    public String getDescription() {
        // Return a string describing the shower
        return " a nice shower ";
    }

}
