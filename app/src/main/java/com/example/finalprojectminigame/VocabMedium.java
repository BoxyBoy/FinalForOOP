package com.example.finalprojectminigame;

import com.example.finalprojectminigame.interfaces.Difficulty;

import java.util.ArrayList;
import java.util.Random;

public class VocabMedium implements Difficulty {
    // list of wrong mediumAnswers for the game. Allows for organization and easy to build on top of.
    public static ArrayList<String> wrongMediumAnswers = new ArrayList<>();
    static ArrayList<String> mediumAnswers = new ArrayList<>();
    public static String correctAnswer;

    @Override
    public void incorrectAnswers(){
        Random randNum = new Random();
        mediumAnswers.add("RADISH");
        mediumAnswers.add("NUMBER");
        mediumAnswers.add("STRING");
        mediumAnswers.add("PENCIL");
        mediumAnswers.add("KAILEE");
        mediumAnswers.add("BARKER");
        mediumAnswers.add("CREATE");
        mediumAnswers.add("TURKEY");
        mediumAnswers.add("JALOPS");
        mediumAnswers.add("SLAPPY");

        for (int i = 0; i < mediumAnswers.size(); i++) {
            int newIndex = randNum.nextInt(mediumAnswers.size());
            String temp = mediumAnswers.get(newIndex);
            mediumAnswers.set(newIndex, mediumAnswers.get(i));
            mediumAnswers.set(i, temp);
        }

        for (int i = 0; i < mediumAnswers.size() - 1; i++) {
            wrongMediumAnswers.add(mediumAnswers.get(i));
        }

        for (int i = 0; i < mediumAnswers.size(); i++) {
            if (!wrongMediumAnswers.contains(mediumAnswers.get(i))) {
                correctAnswer = mediumAnswers.get(i);
            }
        }
    }


    static ArrayList<Integer> likenessMedium = new ArrayList<>();
    public static int count = 0;
    //how many letters in each word are also in the correct answer
    static void theLikenessValues(){

        for (int i = 0; i < wrongMediumAnswers.size(); i++) {
            String tempString = correctAnswer;
            for (int j = 0; j < wrongMediumAnswers.get(i).length(); j++) {
               String character = String.valueOf(wrongMediumAnswers.get(i).charAt(j));
               if (tempString.contains(character)) {
                   count = count + 1;
                   tempString = tempString.replace(character, "");
               }
            }
            likenessMedium.add(count);
            count = 0;
        }
    }
}