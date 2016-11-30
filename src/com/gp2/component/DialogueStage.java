package com.gp2.component;

public abstract class DialogueStage {

    private String Sentence;

    public DialogueStage(String sentence) {
        Sentence = sentence;
    }

    public String getSentence() {
        return Sentence;
    }
}
