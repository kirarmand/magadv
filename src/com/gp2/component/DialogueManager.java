package com.gp2.component;

import java.util.ArrayList;

public class DialogueManager {
	
	/*
	 * This class allows to manage dialogue. It represents a stack of sentence which represents 
	 * a sequence of dialogues. 
	 */
	
	private ArrayList<DialogueStage> dialogueStageStack;
	private int progress;
	
	public DialogueManager(DialogueStage firstDialogue){
		dialogueStageStack.add(firstDialogue);
		progress = 0;
	}
	/*
	 * add a dialogue stage into the list
	 */
	public void addDialogueStage(DialogueStage newDialogue){
		dialogueStageStack.add(newDialogue);
	}
	/*
	 * remove a dialogue stage into the list
	 */
	public void removeDialogueStage(DialogueStage newDialogue){
		dialogueStageStack.remove(newDialogue);
	}
	public ArrayList<DialogueStage> getDialogueStage(){
		return dialogueStageStack;
	}
	public int getProgress(){
		return progress;
	}
}
