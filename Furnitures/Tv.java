package Furnitures;

import Rooms.RoomInterface;

/**
 * Tv class represents a concrete decorator in the Decorator Pattern.
 * It extends the Furniture class and adds functionality to rooms by
 * decorating them with TVs.
 */
public class Tv extends Furniture {
    // Reference to the room being decorated
    RoomInterface room;

    // Static variable to keep track of the number of TVs in all rooms
    private static int numberOfTvs = 0;

    /**
     * Constructor initializes the TV with a reference to the room being decorated.
     */
    public Tv(RoomInterface room) {
        super(); // Calls the constructor of the base class (Furniture)
        numberOfTvs++;
        this.room = room;
    }

    /**
     * Overrides the getDescription method to add information about the TVs in the room.
     */
    @Override
    public String getDescription() {
        if (room.getDescription().contains("TVs")) {
            return room.getDescription();
        }
        String description = numberOfTvs > 1 ? " TVs " : " TV ";
        return room.getDescription() + getNumberOfTvs() + description;
    }

    /**
     * Static method to get the total number of TVs in all rooms.
     */
    public static int getNumberOfTvs() {
        return numberOfTvs;
    }
}
