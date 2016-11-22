package com.gp2.component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author group2
 * 
 * The room is the key part of the game. A room contains its name
 * and a short description. It also contains a hashMap for all the
 * exits that link this room to the others. This hashMap is use to link
 * a string for a direction to an exit, this way the user can choose
 * his destination with these strings.
 * @see class Exit
 */
public class Room {

	/**
	 * The name of the room.
	 */
	public String name;
	
	/**
	 * A description of what a player can see in this room.
	 * The description can also provide generals informations
	 * about the room and/or about its exits.
	 */
	public String description;
	
	/**
	 * The content of a room is stored here with a RoomContainer
	 * that extends the java.util.ArrayList of Entity.
	 */
	public ArrayList<Entity> content;
	
	/**
	 * This hashMap contains all the exits of this room.
	 * All of them got a string as a key, this string is the
	 * direction.
	 * At the class instantiation the hashMap is empty and all
	 * the exits must be added through the addExit method.
	 * @see addExit()
	 */
	public HashMap<String, Exit> exits;
	
	/**
	 * The constructor method for the room. The name and the
	 * description will be specified by the user. But if those
	 * field remain empty the name is set to "Room" and the
	 * description is set to "A room like the others."
	 * The hashMap is created but it remains empty. To precise the 
	 * possible exits please use addExit() method.
	 * The content of the room is set to empty.
	 * @param name	the name given for this new Room
	 * @param description	the description given for this new Room
	 * @see addExit()
	 */
	public Room(String name,String description){
		this.name = name;
		this.description = description;
		this.exits = new HashMap<>();
		this.content = new ArrayList<>();
	}
	
	/**
	 * This method must be used when new exit have to be added
	 * to the room. For example to add a new exit from the
	 * roomA to the roomB we can write
	 * roomA.addExit("north",new Exit(roomA,roomB));
	 * The direction must not be null otherwise the method is
	 * aborted. The given direction or exit must not be already
	 * stored in this hashMap otherwise the method is
	 * aborted.
	 * The start room from the exit given must be this room
	 * otherwise the method is aborted.
	 * @param direction	a string for the direction to take in
	 * order to reach the exit
	 * @param exit	the Exit to link with the given direction
	 */
	public void addExit(String direction,Exit exit){
		if (direction.isEmpty() || exits.containsKey(direction)
				|| exits.containsValue(exit) || !exit.getFirstRoom().equals(this))
			//At least one of the parameter is non-conform the method is aborted
			return;
		exits.put(direction, exit);
	}

	
	/*
	 * GETTERS section for the room relative attributes
	 */

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public HashMap<String, Exit> getExits() {
		return exits;
	}

	public ArrayList<Entity> getContent() {
		return content;
	}
	
}
