/**
 * 
 */
package com.gp2.component;

/**
 * @author group2
 * 
 * The abstract class Entity is designed to define abstract object
 * that can be stored/saved/placed in another like a room.
 * An entity can be for example a NPC, a item or any physical element.
 * The Entity only have a name and a description string attributes.
 * And because the Entity is a very abstract class the name and the
 * description are set as protected, in order to be easily reusable
 * in all the upcoming inheritances of this class.
 */
public abstract class Entity {

	/**
	 * The name of this Entity
	 */
	protected String name;
	
	/**
	 * The description of this Entity
	 */
	protected String description;
	
	
	/*
	 * GETTERS section for the Entity relative attributes
	 */
	
	/**
	 * A general constructor for the entity
	 * @param name	specify here the name of the entity
	 * @param description	specify here a description of the entity
	 */
	public Entity(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	
	
}
