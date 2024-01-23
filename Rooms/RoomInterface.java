package Rooms;

import Behaviors.BalconyBehavior;
import Behaviors.BathroomBehavior;
import Behaviors.ViewBehavior;
import ControlPanels.ControlPanel;

/**
 * RoomInterface class represents an abstract base class for rooms in the system.
 * It defines the common structure and behavior of different types of rooms.
 */
public abstract class RoomInterface {
    // Reference to the control panel associated with the room
    public ControlPanel controlPanel;

    // Behaviors representing balcony, bathroom, and view
    BalconyBehavior balconyBehavior;
    BathroomBehavior bathroomBehavior;
    ViewBehavior viewBehavior;

    // Area of the room
    int areaOfRoom;

    /**
     * Constructor initializes the room with specific behaviors for balcony, bathroom, and view.
     * It also initializes the area of the room to 0.
     * Creates a control panel for the room so the guests could request services.
     */
    public RoomInterface(BalconyBehavior balconyBehavior, BathroomBehavior bathroomBehavior,
            ViewBehavior viewBehavior) {
        this.balconyBehavior = balconyBehavior;
        this.bathroomBehavior = bathroomBehavior;
        this.viewBehavior = viewBehavior;
        this.areaOfRoom = 0;
        this.controlPanel = new ControlPanel();
    }

    /**
     * Gets a description of the room by combining the descriptions of its behaviors.
     */
    public String getDescription() {
        return balconyBehavior.getDescription() + ", " + bathroomBehavior.getDescription() + ", "
                + viewBehavior.getDescription();
    }
}
