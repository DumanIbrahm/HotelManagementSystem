package Furnitures;

import Rooms.RoomInterface;

/**
 * Sofa class represents a concrete decorator in the Decorator Pattern.
 * It extends the Furniture class and adds functionality to rooms by
 * decorating them with sofas.
 */
public class Sofa extends Furniture {
    // Reference to the room being decorated
    RoomInterface room;

    // Static variable to keep track of the number of sofas in all rooms
    private static int numberOfSofas = 0;

    /**
     * Constructor initializes the sofa with a reference to the room being decorated.
     */
    public Sofa(RoomInterface room) {
        super(); // Calls the constructor of the base class (Furniture)
        numberOfSofas++;
        this.room = room;
    }

    /**
     * Overrides the getDescription method to add information about the sofas in the room.
     */
    @Override
    public String getDescription() {
        if (room.getDescription().contains("sofas")) {
            return room.getDescription();
        }
        String description = numberOfSofas > 1 ? " sofas " : " sofa ";
        return room.getDescription() + getNumberOfSofas() + description;
    }

    /**
     * Static method to get the total number of sofas in all rooms.
     */
    public static int getNumberOfSofas() {
        return numberOfSofas;
    }
}
