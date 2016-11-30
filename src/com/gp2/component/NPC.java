package com.gp2.component;

import java.util.ArrayList;

/**
 * 
 * @author group2
 * 
 * The NPCs are the characters that the Player will meet
 * during his journey. In addition to the name and the 
 * description (from Entity), the basic NPC defined here
 * can only tell his text stored in "sentences" no real
 * dialogue is possible.
 * 
 * A NPC must have a name, a description or some sentences
 * to say. Even if without these attributes the interaction is
 * limited, they remains optional.
 */
public class NPC extends Entity{

	/**
	 * This arraylist allows character to speak
	 */
	private ArrayList<DialogueManager> stackList;
	/**
	 * 
	 */
	private ArrayList<Entity> inventory;

	/**
	 * The constructor for the NPC class.
	 * 
	 * @param name	the name of the NPC
	 * @param description	a description of the NPC
	 * @param sentences	all the sentences this NPC will be able to say
	 */
	public NPC(String name, String description, ArrayList<DialogueManager> newStackList) {
		super(name, description);
		this.stackList = newStackList;
	}

	
	/*
	 * GETTERS section for the NPC relative attributes
	 */
	
	public ArrayList<DialogueManager> getDialogueManager() {
		return stackList;
	}

	public ArrayList<Entity> getInventory() {
		return inventory;
	}

}
