/**
 * 
 */
package com.gp2.component;

/**
 * @author group2
 * 
 * The ExitWithString class correspond to an exit that can only
 * be passed out if the player return the good answer to a query.
 * The query must, a minimum, helps the player to find the right
 * answer.
 *
 */
public class ExitWithString extends Exit {

	/**
	 * The query is the enigma/tip given to the player to help
	 * him finding the query
	 */
	private String query;
	
	/**
	 * The answer is the expected solution for user to the given query
	 */
	private String answer;
		
	/**
	 * The constructor for exit that required an answer. For this kind
	 * of exit not only the departure room and the arrival room have to be
	 * specified, but also a query and a answer. Here the query must lead
	 * to the answer.
	 * 
	 * @param firstRoom	the departure room
	 * @param nextRoom	the arrival room
	 * @param query	the query for the player answer
	 * @param answer	the good solution to pass
	 */
	public ExitWithString(Room firstRoom, Room nextRoom, String query, String answer) {
		super(firstRoom, nextRoom);
		this.query = query;
		this.answer = answer;
	}
	
	/**
	 * The constructor for exit that required an answer. For this kind
	 * of exit not only the departure room and the arrival room have to be
	 * specified, but also a query and a answer. Here the query must lead
	 * to the answer.
	 * 
	 * @param firstRoom	the departure room
	 * @param nextRoom	the arrival room
	 * @param description the description of this exit
	 * @param query	the query for the player answer
	 * @param answer	the good solution to pass
	 */
	public ExitWithString(Room firstRoom, Room nextRoom,String description, String query, String answer) {
		super(firstRoom, nextRoom,description);
		this.query = query;
		this.answer = answer;
	}
	
	
	/**
	 * This canPass method is an overridden version of the
	 * super.canPass. Where the super version always let the
	 * player take the exit, the new ExitWithString will only
	 * lets the player pass if he give the good answer.
	 * 
	 * @param player	the instance of player that want to use this exit
	 * @return a boolean is return telling is the given player can take
	 * this exit. 
	 * 
	 * @Override
	 */
	public boolean canPass(Player player){
		//Present the query to the player
		if(getPlayerAnswer().equals(answer)){
			return true;
		}
		//Not the good answer!
		return false;
	}
	
	/**
	 * getPlayerAnswer must be considered as DEPRECATED until it 
	 * does REALLY listen what user is typing.
	 * Tt correspond to a user string input.
	 * @deprecated
	 */
	private String getPlayerAnswer(){
		return "dumbDummy";
	}
	
	/*
	 * GETTERS section for the ExitWithString relative attributes
	 */

	public String getQuery() {
		return query;
	}

	public String getAnswer() {
		return answer;
	}

}
