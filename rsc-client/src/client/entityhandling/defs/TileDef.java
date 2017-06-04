package client.entityhandling.defs;

/**
 * Data relating to a tile of the game world.
 */
public class TileDef {
    
    public int colour;
    public int unknown;
    public int objectType;

    public int getColour() {
        return colour;
    }

    public int getUnknown() {
        return unknown;
    }

    public int getObjectType() {
        return objectType;
    }
    
}