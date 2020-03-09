package com.example.finalprojectminigame;

import java.util.ArrayList;
import java.util.Random;

public class Vocab {
    // list of wrong answers for the game. Allows for organization and easy to build on top of.
    public static ArrayList<String> wrongAnswers = new ArrayList<>();
    static ArrayList<String> answers = new ArrayList<>();
    public static String correctAnswer;


    static void incorrectAnswers(){
        Random randNum = new Random();
        answers.add("RADISH");
        answers.add("NUMBER");
        answers.add("STRING");
        answers.add("PENCIL");
        answers.add("KAILEE");
        answers.add("BARKER");
        answers.add("CREATE");
        answers.add("TURKEY");
        answers.add("JALOPS");
        answers.add("SLAPPY");

        for (int i = 0; i < answers.size(); i++) {
            int newIndex = randNum.nextInt(answers.size());
            String temp = answers.get(newIndex);
            answers.set(newIndex, answers.get(i));
            answers.set(i, temp);
        }

        for (int i = 0; i < answers.size() - 1; i++) {
            wrongAnswers.add(answers.get(i));
        }

        for (int i = 0; i < answers.size(); i++) {
            if (!wrongAnswers.contains(answers.get(i))) {
                correctAnswer = answers.get(i);
            }
        }
    }


    static ArrayList<Integer> likeness = new ArrayList<>();
    public static int count = 0;
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

//        for (int i = 0; i < wrongAnswers.size(); i++) {
//            String tempString = correctAnswer;
//            for (int j = 0; j < wrongAnswers.get(i).length(); j++) {
//               String character = String.valueOf(wrongAnswers.get(i).charAt(j));
//               if (tempString.contains(character)) {
//                   count = count + 1;
//                   tempString = tempString.replace(character, "");
//               }
//            }
//            likeness.add(count);
//            count = 0;
//        }
    }
}