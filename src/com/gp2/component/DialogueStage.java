package com.gp2.component;

public abstract class DialogueStage {

    /*
    * class who give the basics answers of the NPC
    */
    private String Sentence;

    public DialogueStage(String sentence) {
        Sentence = sentence;
    }

    public String getSentence() {
        return Sentence;
    }
}
