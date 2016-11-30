package com.gp2.component;
/*
 * class which inherits from the DialogueStage class 
 * Which can give a precise object after the sentence
 */

public class DialogueStageExitJail extends DialogueStage {

	private Exit goJAil;

	public DialogueStageExitJail(String sentence, Exit goJAil) {
		super(sentence);
		this.goJAil = goJAil;
	}

	public Exit getGoJAil() {
		return goJAil;
	}
}
