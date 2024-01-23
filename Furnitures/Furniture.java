package Furnitures;

import Rooms.RoomInterface;

/**
 * Furniture class serves as a wrapper class in the Decorator Pattern.
 * It extends the RoomInterface, acting as a base component or abstract decorator
 * that other concrete decorators can extend to add additional functionality to rooms.
 */
public abstract class Furniture extends RoomInterface {

    /**
     * Constructor initializes the furniture with default parameters.
     */
    public Furniture() {
        super(null, null, null);
    }

}
