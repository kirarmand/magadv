package com.gp2.component;
/*
 * class which inherits from the DialogueStage class 
 * Which can give a precise object after the sentence
 */

public class DialogueStageExitJail extends DialogueStage {

	private Exit goJail;

	public DialogueStageExitJail(String sentence, Exit goJAil) {
		super(sentence);
		this.goJail = goJAil;
	}

	public Exit getGoJail() {
		return goJail;
	}
}
