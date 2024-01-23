package Rooms;

import Behaviors.BalconyBehavior;
import Behaviors.BathroomBehavior;
import Behaviors.ViewBehavior;

/**
 * Room200 class represents a room that has area of 200 squre meters in the system.
 * It extends the RoomInterface class, providing details specific to Room 200.
 */
public class Room200 extends RoomInterface {

    /**
     * Constructor initializes Room 200 with specific behaviors for balcony, bathroom, and view.
     * It also initializes the area of Room 200 to 200 square meters.
     */
    public Room200(BalconyBehavior balconyBehavior, BathroomBehavior bathroomBehavior, ViewBehavior viewBehavior) {
        super(balconyBehavior, bathroomBehavior, viewBehavior);
        super.areaOfRoom = 200;
    }

    /**
     * Overrides the getDescription method to add specific details about Room 200.
     */
    @Override
    public String getDescription() {
        return "Room 200 square meters, has " + super.getDescription();
    }
}
