package com.example.finalprojectminigame;



import android.widget.Button;
import android.widget.TextView;

import static com.example.finalprojectminigame.BracketCommands.bracketCommands;
import static com.example.finalprojectminigame.VocabEasy.likenessEasy;
import static com.example.finalprojectminigame.VocabEasy.wrongEasyAnswers;
import static com.example.finalprojectminigame.VocabHard.likenessHard;
import static com.example.finalprojectminigame.VocabHard.wrongHardAnswers;
import static com.example.finalprojectminigame.VocabMedium.correctAnswer;
import static com.example.finalprojectminigame.VocabMedium.likenessMedium;
import static com.example.finalprojectminigame.VocabMedium.wrongMediumAnswers;

public class Controller {
    public TextView guessAmountView, terminalView, guessResultView, guessInput;
    public Button buttonCheck;
    public String difficulty;

    public Controller(TextView guessInput, TextView guessAmountView, TextView terminalView, TextView guessResultView, Button buttonCheck, String difficulty){
        this.guessInput = guessInput;
        this.guessAmountView = guessAmountView;
        this.terminalView = terminalView;
        this.guessResultView = guessResultView;
        this.buttonCheck = buttonCheck;
        this.difficulty = difficulty;
    }
    int guesses = 4;


    String searchName;
    String searchBracket;

    //literally the entire game | Checks to see if the user's guess is correct or if it is one of the "bracket commands"

    public void buttonCode(){

        searchName = guessInput.getText().toString();
        searchBracket = guessInput.getText().toString();
        Prompt p = new Prompt();

        //if the entered guess is wrong
        //TODO Make if statement that checks for difficulty here and change wrong.....Answers to the correct names.
        if(wrongMediumAnswers.contains(searchName.toUpperCase())) {
            guessResultView.append(userGuessResponse(difficulty));
            guessResultView.setText(guessResultView.getText());
            guesses--;
            String guessAmount = guesses + " attempt(s) left:";
            //ticks down a guess when wrong
            for(int i = 0;i<guesses;i++){
                guessAmount += " []";
            }
            guessAmountView.setText(guessAmount);
            return;
        }
        //if the guess is correct
        else if(searchName.toUpperCase().equals(correctAnswer)){
            guessResultView.append(winMessage());
            buttonCheck.setEnabled(false);
            return;
        }

        //this removes a wrong answer when the correct "command" is entered. Does not use a guess.
        //String searchBracket = guessInput.getText().toString();
        if(bracketCommands.contains(searchBracket)){
            guessResultView.append(dudRemoveResponse());
            for(int i = 0;i<wrongMediumAnswers.size();i++){
                if(wrongMediumAnswers.get(i).equals("......")){
                    continue;
                }
                wrongMediumAnswers.set(i, "......");
                break;
            }
            terminalView.setText(p.thePrompt);
            return;
        }
        //this resets the amount of guesses back to 4 if the correct "command" is entered
        else if(searchBracket.equals(BracketCommands.resetTries)){
            guessResultView.append("\n>ATTEMPTS RESET");
            //reset tries on text view and in code
            guesses = 4;
            guessAmountView.setText(guessReset());
            return;
        }
        //this executes if the guess someone enters isnt one of the options
        guessResultView.append(invalidInput());
    }

    private String guessReset(){
        return guesses + " attempt(s) left: [] [] [] []";
    }

    private String invalidInput(){
        return "\n>" + searchName + "\nERROR";
    }

    private String dudRemoveResponse(){
        return "\n>" + searchBracket + "\n>REMOVED DUD";
    }

    private String winMessage(){
        return "\n>" + searchName + "\n>ACCESS GRANTED!";
    }

    public String outputString;

    private String userGuessResponse(String difficulty){

        if (difficulty.equals("easy")) {
            outputString = "\n>" + searchName.toUpperCase() + "\n>ACCESS DENIED\n>LIKENESS = " + likenessEasy.get(wrongEasyAnswers.indexOf(searchName.toUpperCase())) + "/4";
        } else if (difficulty.equals("medium")) {
           outputString = "\n>" + searchName.toUpperCase() + "\n>ACCESS DENIED\n>LIKENESS = " + likenessMedium.get(wrongMediumAnswers.indexOf(searchName.toUpperCase())) + "/6";
        } else if (difficulty.equals("hard")) {
            outputString = "\n>" + searchName.toUpperCase() + "\n>ACCESS DENIED\n>LIKENESS = " + likenessHard.get(wrongHardAnswers.indexOf(searchName.toUpperCase())) + "/8";
        }
        return outputString;
    }
}
