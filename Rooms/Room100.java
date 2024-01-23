package Rooms;

import Behaviors.BalconyBehavior;
import Behaviors.BathroomBehavior;
import Behaviors.ViewBehavior;
/**
 * Room100 class represents a room that has area of 100 squre meters in the system.
 * It extends the RoomInterface class, providing details specific to Room 100.
 */
public class Room100 extends RoomInterface {
    /**
     * Constructor initializes Room 100 with specific behaviors for balcony, bathroom, and view.
     * It also initializes the area of Room 100 to 100 square meters.
     */

    public Room100(BalconyBehavior balconyBehavior, BathroomBehavior bathroomBehavior, ViewBehavior viewBehavior) {
        super(balconyBehavior, bathroomBehavior, viewBehavior);
        super.areaOfRoom = 100;
    }
    // Overrides the getDescription method to add specific details about Room 100.
    @Override
    public String getDescription() {
        return "Room 100 square meters " + super.getDescription();
    }

}
