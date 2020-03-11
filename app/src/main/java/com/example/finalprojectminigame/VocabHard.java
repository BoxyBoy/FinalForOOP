package com.example.finalprojectminigame;

import com.example.finalprojectminigame.interfaces.Difficulty;

import java.util.ArrayList;
import java.util.Random;

public class VocabHard implements Difficulty {
    // list of wrong hardAnswers for the game. Allows for organization and easy to build on top of.
    public static ArrayList<String> wrongHardAnswers = new ArrayList<>();
    static ArrayList<String> hardAnswers = new ArrayList<>();
    public static String correctHardAnswer;

    @Override
    public void incorrectAnswers(){
        Random randNum = new Random();
        hardAnswers.add("RECOVERY");
        hardAnswers.add("ACCEPTED");
        hardAnswers.add("FACILITY");
        hardAnswers.add("BROTHERS");
        hardAnswers.add("HARDWARE");
        hardAnswers.add("KEYBOARD");
        hardAnswers.add("OPPOSITE");
        hardAnswers.add("STRENGTH");
        hardAnswers.add("WIRELESS");
        hardAnswers.add("DECEASED");

        for (int i = 0; i < hardAnswers.size(); i++) {
            int newIndex = randNum.nextInt(hardAnswers.size());
            String temp = hardAnswers.get(newIndex);
            hardAnswers.set(newIndex, hardAnswers.get(i));
            hardAnswers.set(i, temp);
        }

        for (int i = 0; i < hardAnswers.size() - 1; i++) {
            wrongHardAnswers.add(hardAnswers.get(i));
        }

        for (int i = 0; i < hardAnswers.size(); i++) {
            if (!wrongHardAnswers.contains(hardAnswers.get(i))) {
                correctHardAnswer = hardAnswers.get(i);
            }
        }
    }

    static ArrayList<Integer> likenessHard = new ArrayList<>();
    public static int count = 0;
    //how many letters in each word are also in the correct answer
    static void theLikenessValues(){

        for (int i = 0; i < wrongHardAnswers.size(); i++) {
            String tempString = correctHardAnswer;
            for (int j = 0; j < wrongHardAnswers.get(i).length(); j++) {
                String character = String.valueOf(wrongHardAnswers.get(i).charAt(j));
                if (tempString.contains(character)) {
                    count = count + 1;
                    tempString = tempString.replace(character, "");
                }
            }
            likenessHard.add(count);
            count = 0;
        }
    }
}
