package Rooms;

import Behaviors.BalconyBehavior;
import Behaviors.BathroomBehavior;
import Behaviors.ViewBehavior;

/**
 * Room150 class represents a room that has area of 150 squre meters in the system.
 * It extends the RoomInterface class, providing details specific to Room 150.
 */
public class Room150 extends RoomInterface {
    /**
     * Constructor initializes Room 150 with specific behaviors for balcony, bathroom, and view.
     * It also initializes the area of Room 150 to 150 square meters.
     */
    public Room150(BalconyBehavior balconyBehavior, BathroomBehavior bathroomBehavior, ViewBehavior viewBehavior) {
        super(balconyBehavior, bathroomBehavior, viewBehavior);
        super.areaOfRoom = 150;
    }
    // Overrides the getDescription method to add specific details about Room 150.
    @Override
    public String getDescription() {
        return "Room 150 square meters, has " + super.getDescription();
    }
}
