package com.example.finalprojectminigame;

import com.example.finalprojectminigame.interfaces.Difficulty;

import java.util.ArrayList;
import java.util.Random;

public class VocabEasy implements Difficulty {
    // list of wrong easyAnswers for the game. Allows for organization and easy to build on top of.
    public static ArrayList<String> wrongEasyAnswers = new ArrayList<>();
    static ArrayList<String> easyAnswers = new ArrayList<>();
    public static String correctEasyAnswer;

    @Override
    public void incorrectAnswers(){
        Random randNum = new Random();
        easyAnswers.add("FOUR");
        easyAnswers.add("SOAP");
        easyAnswers.add("ACID");
        easyAnswers.add("BOOK");
        easyAnswers.add("EDGE");
        easyAnswers.add("GAIN");
        easyAnswers.add("LIVE");
        easyAnswers.add("KEYS");
        easyAnswers.add("MATH");
        easyAnswers.add("OPEN");

        for (int i = 0; i < easyAnswers.size(); i++) {
            int newIndex = randNum.nextInt(easyAnswers.size());
            String temp = easyAnswers.get(newIndex);
            easyAnswers.set(newIndex, easyAnswers.get(i));
            easyAnswers.set(i, temp);
        }

        for (int i = 0; i < easyAnswers.size() - 1; i++) {
            wrongEasyAnswers.add(easyAnswers.get(i));
        }

        for (int i = 0; i < easyAnswers.size(); i++) {
            if (!wrongEasyAnswers.contains(easyAnswers.get(i))) {
                correctEasyAnswer = easyAnswers.get(i);
            }
        }
    }

    static ArrayList<Integer> likenessEasy = new ArrayList<>();
    public static int count = 0;
    //how many letters in each word are also in the correct answer
    static void theLikenessValues(){

        for (int i = 0; i < wrongEasyAnswers.size(); i++) {
            String tempString = correctEasyAnswer;
            for (int j = 0; j < wrongEasyAnswers.get(i).length(); j++) {
                String character = String.valueOf(wrongEasyAnswers.get(i).charAt(j));
                if (tempString.contains(character)) {
                    count = count + 1;
                    tempString = tempString.replace(character, "");
                }
            }
            likenessEasy.add(count);
            count = 0;
        }
    }
}
