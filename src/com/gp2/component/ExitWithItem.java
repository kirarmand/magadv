/**
 * 
 */
package com.gp2.component;

/**
 * @author group2
 *
 * The ExitWithItem class correspond to an exit that can only
 * be passed out if the player owned the required object.
 *
 */
public class ExitWithItem extends Exit {

	/**
	 * The item stored here must be owned by the player who try
	 * to pass the exit.
	 */
	private Item requiredItem;
	
	
	/**
	 * The constructor for exit that required an item. For this kind
	 * of exit not only the departure room and the arrival room have to be
	 * specified, but also the object that the player has to own to pass.
	 * @param firstRoom	the departure room
	 * @param nextRoom	the arrival room
	 * @param requiredItem	the item required to pass
	 */
	public ExitWithItem(Room firstRoom, Room nextRoom, Item requiredItem) {
		super(firstRoom, nextRoom);
		this.requiredItem = requiredItem;
	}
	
	/**
	 * The constructor for exit that required an item. For this kind
	 * of exit not only the departure room and the arrival room have to be
	 * specified, but also the object that the player has to own to pass.
	 * @param firstRoom	the departure room
	 * @param nextRoom	the arrival room
	 * @param description the description of this exit
	 * @param requiredItem	the item required to pass
	 */
	public ExitWithItem(Room firstRoom, Room nextRoom, String description, Item requiredItem) {
		super(firstRoom, nextRoom, description);
		this.requiredItem = requiredItem;
	}
	
	/**
	 * This canPass method is an overridden version of the
	 * super.canPass. Where the super version always let the
	 * player take the exit, the new ExitWithItem will only
	 * lets the player pass if he has the required item.
	 * 
	 * @param player	the instance of player that want to use this exit
	 * @return a boolean is return telling is the given player can take
	 * this exit. 
	 * @Override
	 */
	public boolean canPass(Player player){
		if(player.getInventory().contains(requiredItem))
			return true;
		//The player does not have the required item
		return false;
	}
	
	
	/*
	 * GETTERS section for the ExitWithItem relative attribute
	 */
	
	public Item getRequiredItem(){
		return requiredItem;
	}

}
