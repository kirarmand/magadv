package com.gp2.component;

public class DialogueStage {

    /*
    * class who give the basics answers of the NPC
    */
    private String sentence;

    public DialogueStage(String newSentence) {
        sentence = newSentence;
    }

    public String getSentence() {
        return sentence;
    }
}
