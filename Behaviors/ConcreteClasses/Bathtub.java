package Behaviors.ConcreteClasses;

import Behaviors.BathroomBehavior;

// The class Bathtub implements the BathroomBehavior interface

public class Bathtub implements BathroomBehavior {
    // Overriding the getDescription method from the interface
    @Override
    public String getDescription() {
        // Return a string describing the bathtub
        return " a nice bathtub ";
    }

}
