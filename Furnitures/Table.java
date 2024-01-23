package Furnitures;

import Rooms.RoomInterface;

/**
 * Table class represents a concrete decorator in the Decorator Pattern.
 * It extends the Furniture class and adds functionality to rooms by
 * decorating them with tables.
 */
public class Table extends Furniture {
    // Reference to the room being decorated
    RoomInterface room;

    // Static variable to keep track of the number of tables in all rooms
    private static int numberOfTables = 0;

    /**
     * Constructor initializes the table with a reference to the room being decorated.
     */
    public Table(RoomInterface room) {
        super(); // Calls the constructor of the base class (Furniture)
        numberOfTables++;
        this.room = room;
    }

    /**
     * Overrides the getDescription method to add information about the tables in the room.
     */
    @Override
    public String getDescription() {
        if (room.getDescription().contains("tables")) {
            return room.getDescription();
        }
        String description = numberOfTables > 1 ? " tables " : " table ";
        return room.getDescription() + getNumberOfTables() + description;
    }

    /**
     * Static method to get the total number of tables in all rooms.
     */
    public static int getNumberOfTables() {
        return numberOfTables;
    }
}
