package com.gp2.component;

import java.util.ArrayList;

public class DialogueStageInput extends DialogueStage {

    private ArrayList <String> answers;

    private String goodAnswer;

    public DialogueStageInput(String sentence, ArrayList<String> answers) {
        super(sentence);
        this.answers = answers;
        this.goodAnswer = goodAnswer;
    }

    public Boolean goodAnswers(String propose){
        return (goodAnswer == propose);
    }
}
