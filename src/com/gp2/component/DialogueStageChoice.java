package com.gp2.component;

import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;

/*
 * class which inherits from the DialogueStage class
 * Which can give a precise object after the sentence
 */

public class DialogueStageChoice extends DialogueStage {

    private ArrayList <String> answers;

    private int goodAnswer;

    public DialogueStageChoice(String sentence, ArrayList<String> answers, int goodAnswer) {
        super(sentence);
        this.answers = answers;
        this.goodAnswer = goodAnswer;
    }

    public Boolean goodAnswer(int propose){
        return (goodAnswer == propose);
    }
}
