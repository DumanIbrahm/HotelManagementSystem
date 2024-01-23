package Behaviors.ConcreteClasses;

import Behaviors.ViewBehavior;

// The class seaView implements the ViewBehavior interface
public class seaView implements ViewBehavior {
    // Overriding the getDescription method from the interface
    @Override
    public String getDescription() {
        // Return a string describing the seaView
        return " a nice view of the sea, ";
    }

}
