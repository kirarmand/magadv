package com.gp2.component;
/*
 * class which inherits from the DialogueStage class 
 * Which can give a precise object after the sentence
 */

public class DialogueStageGiveObject extends DialogueStage {
	private Item givedItem;
	
	
	public DialogueStageGiveObject(String sentence, Item newGivedItem){
		super(sentence);
		this.givedItem = newGivedItem;
	}
	
	public Item getItem(){
		return givedItem;
	}

}
