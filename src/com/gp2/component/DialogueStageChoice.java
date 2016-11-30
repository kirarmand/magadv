package com.gp2.component;

import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;

public class DialogueStageChoice extends DialogueStage {

    private ArrayList <String> answers;

    private int goodAnswer;

    public DialogueStageChoice(String sentence, ArrayList<String> answers, int goodAnswer) {
        super(sentence);
        this.answers = answers;
        this.goodAnswer = goodAnswer;
    }

    private Boolean goodAnswer(int propose){
        return (goodAnswer == propose);
    }
}
