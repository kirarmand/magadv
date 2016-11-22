/**
 * 
 */
package com.gp2.component;

/**
 * @author group2
 *
 * The item class extends the Entity in order to be carried
 * by our player an Entity must implements the Carriageable
 * interface.
 * So an "item" is the most simple Entity that a Player object
 * is able to carry.
 */
public class Item extends Entity implements Carriageable{

	/**
	 * The entity constructor-like is used as item constructor.
	 */
	public Item(String name, String description) {
		super(name, description);
	}
	
}
