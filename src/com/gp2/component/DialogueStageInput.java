package com.gp2.component;

import java.util.ArrayList;

public class DialogueStageInput extends DialogueStage {

    private ArrayList <String> answers;

    private String goodAnswer;

    public DialogueStageInput(String sentence, ArrayList<String> answers, String goodAnswer) {
        super(sentence);
        this.answers = answers;
        this.goodAnswer = goodAnswer;
    }

    private Boolean goodAnswer(String propose){
        return (goodAnswer == propose);
    }
}
