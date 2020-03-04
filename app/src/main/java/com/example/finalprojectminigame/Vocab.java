package com.example.finalprojectminigame;

import java.util.ArrayList;

public class Vocab {
    // list of wrong answers for the game. Allows for organization and easy to build on top of.
    static ArrayList<String> wrongAnswers = new ArrayList<>();

    static void incorrectAnswers(){
        wrongAnswers.add("RADISH");
        wrongAnswers.add("NUMBER");
        wrongAnswers.add("STRING");
        wrongAnswers.add("PENCIL");
        wrongAnswers.add("KAILEE");
        wrongAnswers.add("BARKER");
        wrongAnswers.add("CREATE");
        wrongAnswers.add("TURKEY");
        wrongAnswers.add("JALOPS");
    }
    static String correctAnswer = "SLAPPY";

    static ArrayList<Integer> likeness = new ArrayList<>();
    //how many letters in each word are also in the correct answer
    static void theLikenessValues(){
        likeness.add(2);
        likeness.add(0);
        likeness.add(1);
        likeness.add(2);
        likeness.add(2);
        likeness.add(1);
        likeness.add(1);
        likeness.add(1);
        likeness.add(3);
    }
}