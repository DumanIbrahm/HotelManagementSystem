package Rooms;

import Behaviors.ConcreteClasses.Balcony;
import Behaviors.ConcreteClasses.Jacuzzi;
import Behaviors.ConcreteClasses.seaView;

/**
 * SuitRoom class represents a specific type of room (Suit Room) in the system.
 * It implements the Singleton Design Pattern and extends the RoomInterface
 * class,
 * providing details specific to the Suit Room.
 */
public class SuitRoom extends RoomInterface {
    // Singleton instance of SuitRoom
    private static SuitRoom room;

    /**
     * Private constructor initializes Suit Room with specific behaviors for
     * balcony, bathroom, and view.
     */
    private SuitRoom() {
        super(new Balcony(), new Jacuzzi(), new seaView());
    }

    /**
     * Static method to get the singleton instance of SuitRoom.
     */
    public static SuitRoom getRoom() {
        if (room == null) {
            room = new SuitRoom();
        } else {
            return null;
        }

        return room;
    }

    /**
     * Overrides the toString method to provide a string representation of Suit
     * Room.
     */
    @Override
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Suit Room -------\n");
        stringBuff.append("Suit Room has ").append(balconyBehavior.getDescription()).append(".\n");
        stringBuff.append("Suit Room has ").append(bathroomBehavior.getDescription()).append(".\n");
        stringBuff.append("Suit Room has ").append(viewBehavior.getDescription()).append(".\n");
        return stringBuff.toString();
    }

    @Override
    public String getDescription() {

        return "This suit room 200 square meters, has " + super.getDescription();
    }
}
