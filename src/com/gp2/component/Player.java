/*
 * pj
 */
package com.gp2.component;

import java.util.ArrayList;

/**
 * @author group2
 *
 * The player is the main playable entity in our game,
 * the user embodies a Player instantiation.
 * The player is supposed to have an inventory
 * and he can pick up objects(entities), and add them
 * to his inventory. He can also drop them off his inventory.
 * 
 * The two only directly configurable attributes are the player name
 * (by default the player is called "Roberto") and his current
 * position with currentRoom
 */
public class Player{

	/**
	 * The name of the player, can only be set through the constructor
	 */
	private String name;
	
	/**
	 * The inventory of the player, is created with the constructor
	 * and it is managed with the following methods:
	 * @see pickUp()
	 */
	private ArrayList<Entity> inventory;
	
	/**
	 * 
	 */
	private Room currentRoom;
	
	
	/**
	 * The player constructor. A newly created Player only has his
	 * name set. By default the inventory is created and empty. And
	 * the player start in a room (startingRoom)
	 * @param name	the name of the Player
	 * @param startingRoom	the room where the Player start his journey
	 */
	public Player(String name,Room startingRoom){
		if (name.isEmpty())
			this.name = "Roberto";
		else
			this.name = name;
		this.currentRoom = startingRoom;
		this.inventory = new ArrayList<>();
	}
	
	/**
	 * The move() method allows the player to move from his room to
	 * an other using an exit, this exit must be a currentRoom exit.
	 * The canPass() method from the given exit determine if this
	 * player is allowed/able to take this exit.
	 * 
	 * @param exit	The exit that this player try to pass through
	 */
	public void move(Exit exit){
		if(exit.canPass(this)){
			this.currentRoom = exit.getNextRoom();
			//The player changed rooms
		}
		else{
			//The player did not change room
		}
	}
	
	/**
	 * The pickUp method allows the player to pick a given object
	 * in the currentRoom and add it to his own inventory.
	 * Only the Carriageable entity can be carry, so only the object
	 * of implementing Carriageable entity inheriting class will be 
	 * @param item	the item picked up by this Player
	 */
	public void pickUp(Entity entity){
		if(currentRoom.getContent().contains(entity)){
			if(entity instanceof Carriageable){
				this.inventory.add(entity);
				currentRoom.getContent().remove(entity);
			}else{
				//This entity cannot be carry
			}
		}else{
			//The room does not contain this item
		}
		
	}
	
	/**
	 * The dropOff method allows the player to drop off a given object
	 * in his inventory.
	 * This action result to removal of the given Entity
	 * @param entity	the entity picked up by this Player
	 */
	public void dropOff(Entity entity){
		if(this.inventory.contains(entity))
			this.inventory.remove(entity);
		else{
			//The given entity is not owned by the player
		}
	}
	
	/*
	 * GETTERS section for the player relative attributes
	 */
	
	public String getName() {
		return name;
	}

	public ArrayList<Entity> getInventory() {
		return inventory;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}
}
