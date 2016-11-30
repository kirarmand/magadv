package com.gp2.component;

public class DialogueStage {

    /*
    * class who give the basics answers of the NPC
    */
    private String sentence;

    public DialogueStage(String sentence) {
        sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }
}
