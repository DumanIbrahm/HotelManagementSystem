package Furnitures;

import Rooms.RoomInterface;

/**
 * Fridge class represents a concrete decorator in the Decorator Pattern.
 * It extends the Furniture class and adds functionality to rooms by
 * decorating them with fridges.
 */
public class Fridge extends Furniture {
    // Reference to the room being decorated
    RoomInterface room;

    // Static variable to keep track of the number of fridges in all rooms
    private static int numberOfFridges = 0;

    /**
     * Constructor initializes the fridge with a reference to the room being decorated.
     */
    public Fridge(RoomInterface room) {
        super(); // Calls the constructor of the base class (Furniture)
        numberOfFridges++;
        this.room = room;
    }

    /**
     * Overrides the getDescription method to add information about the fridges in the room.
     */
    @Override
    public String getDescription() {
        if (room.getDescription().contains("fridges")) {
            return room.getDescription();
        }
        String description = getNumberOfFridges() > 1 ? " fridges " : " fridge ";
        return room.getDescription() + getNumberOfFridges() + description;
    }

    /**
     * Static method to get the total number of fridges in all rooms.
     */
    public static int getNumberOfFridges() {
        return numberOfFridges;
    }
}
