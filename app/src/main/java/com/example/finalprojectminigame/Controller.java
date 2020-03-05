package com.example.finalprojectminigame;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.finalprojectminigame.BracketCommands.bracketCommands;
import static com.example.finalprojectminigame.Vocab.correctAnswer;
import static com.example.finalprojectminigame.Vocab.likeness;
import static com.example.finalprojectminigame.Vocab.wrongAnswers;

public class Controller {
    int guesses = 4;

    public TextView guessAmountView, terminalView, guessResultView, guessInput;

    public Button buttonCheck;

    String searchName = guessInput.getText().toString();
    String searchBracket = guessInput.getText().toString();

    Prompt p = new Prompt();

    //literally the entire game | Checks to see if the user's guess is correct or if it is one of the "bracket commands"

    public void buttonCode(){
        Prompt p = new Prompt();
        //if the entered guess is wrong
        if(wrongAnswers.contains(searchName.toUpperCase())) {
            guessResultView.append(userGuessResponse());
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
            for(int i = 0;i<wrongAnswers.size();i++){
                if(wrongAnswers.get(i).equals("......")){
                    continue;
                }
                wrongAnswers.set(i, "......");
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

    private String userGuessResponse(){
        return "\n>" + searchName.toUpperCase() + "\n>ACCESS DENIED\n>LIKENESS = " + likeness.get(wrongAnswers.indexOf(searchName.toUpperCase())) + "/6";
    }
}
