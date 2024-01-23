package Behaviors.ConcreteClasses;

import Behaviors.ViewBehavior;

// The class mountainView implements the ViewBehavior interface
public class mountainView implements ViewBehavior {
    // Overriding the getDescription method from the interface
    @Override
    public String getDescription() {
        // Return a string describing the mountainView
        return " a nice view of the mountains, ";
    }

}
