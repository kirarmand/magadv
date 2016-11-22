/**
 * 
 */
package com.gp2.component;

/**
 * @author group2
 *
 * The basic Exit class. The principle of this basic Exit class
 * is that the player can always pass this exit (the canPass
 * method for a given player always return true).
 * This exit also contains both departure and arrival room
 * (respectively firstRoom and nextRoom). A description
 * of the room is also provided for the player.
 * Please notice that the exit that link a RoomA to a RoomB
 * will not link the RoomB to a RoomA. If a two-way track is
 * wanted two different exit must be created.
 * @see class Room
 */
public class Exit {

	/**
	 * A description of the exit. For example "A wooden door...
	 * It seems open."
	 * The description is optional.
	 */
	public String description;
	
	/**
	 * The departure room of the exit
	 */
	private Room firstRoom;
	
	/**
	 * The arrival room
	 */
	private Room nextRoom;
	
	/**
	 * The constructor for the basic exit. For this kind of exit 
	 * only the departure room and the arrival room have to be
	 * specified.
	 * @param firstRoom	the departure room
	 * @param nextRoom	the arrival room
	 */
	public Exit(Room firstRoom, Room nextRoom) {
		this.firstRoom = firstRoom;
		this.nextRoom = nextRoom;
		this.description = "";
	}
	
	/**
	 * The constructor for the basic exit. For this kind of exit 
	 * only the departure room and the arrival room have to be
	 * specified.
	 * @param firstRoom	the departure room
	 * @param nextRoom	the arrival room
	 * @param description	the description of this exit
	 */
	public Exit(Room firstRoom, Room nextRoom,String description) {
		this.firstRoom = firstRoom;
		this.nextRoom = nextRoom;
		this.description = description;
	}

	/**
	 * The canPass method is used when we want to know if the 
	 * player is able to use this exit.
	 * This method can be override when we want conditions for the 
	 * player to take the exit.
	 * @param player	the instance of player that want to use this exit
	 * @return a boolean is returned: when true the given player is suitable for this exit
	 * when false the player is not.
	 */
	public boolean canPass(Player player){
		return true;
	}
	
	
	/*
	 * GETTERS section for the exit relative attributes
	 */
	
	public Room getFirstRoom() {
		return firstRoom;
	}

	public Room getNextRoom() {
		return nextRoom;
	}

	public String getDescription() {
		return description;
	}

}
