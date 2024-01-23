package Furnitures;

import Rooms.RoomInterface;

/**
 * Bed class represents a concrete decorator in the Decorator Pattern.
 * It extends the Furniture class and adds functionality to rooms by
 * decorating them with beds.
 */
public class Bed extends Furniture {
    // Reference to the room being decorated
    RoomInterface room;
    
    // Static variable to keep track of the number of beds in all rooms
    private static int numberOfBeds = 0;

    // Constructor initializes the bed with a reference to the room being decorated. 
    public Bed(RoomInterface room) {
        super(); 
        numberOfBeds++;
        this.room = room;
    }

    // Overrides the getDescription method to add information about the beds in the room.
    @Override
    public String getDescription() {
        if(room.getDescription().contains("beds")){
            return room.getDescription();
        }
        String description = getNumberOfBeds() > 1 ? " beds " : " bed ";
        return room.getDescription() + getNumberOfBeds() + description;
    }

    //Static method to get the total number of beds in all rooms.
    public static int getNumberOfBeds() {
        return numberOfBeds;
    }
}
